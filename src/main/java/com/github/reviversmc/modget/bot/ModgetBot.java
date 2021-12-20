package com.github.reviversmc.modget.bot;

import java.io.IOException;

import javax.enterprise.event.Observes;

import org.jboss.logging.Logger;
import org.kohsuke.github.GHEventPayload;

import io.quarkiverse.githubapp.event.Issue;
import io.quarkus.runtime.StartupEvent;

public class ModgetBot {

	private static final Logger LOG = Logger.getLogger(ModgetBot.class);

	void init(@Observes StartupEvent startupEvent) {
		LOG.info(">>> Modget Bot is running in dry-run mode");
	}

	void onOpen(@Issue.Opened GHEventPayload.Issue issuePayload) throws IOException {
		issuePayload.getIssue().comment("Hello from my GitHub App");
	}

}
