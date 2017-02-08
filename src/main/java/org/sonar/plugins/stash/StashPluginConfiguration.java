package org.sonar.plugins.stash;

import com.google.common.collect.Sets;

import org.sonar.api.BatchComponent;
import org.sonar.api.CoreProperties;
import org.sonar.api.batch.InstantiationStrategy;
import org.sonar.api.config.Settings;

import java.util.Set;

@InstantiationStrategy(InstantiationStrategy.PER_BATCH)
public class StashPluginConfiguration implements BatchComponent {

  private Settings settings;

  public StashPluginConfiguration(Settings settings) {
    this.settings = settings;
  }

  public boolean hasToNotifyStash() {
    return settings.getBoolean(StashPlugin.STASH_NOTIFICATION);
  }

  public String getStashProject() {
    return settings.getString(StashPlugin.STASH_PROJECT);
  }

  public String getStashRepository() {
    return settings.getString(StashPlugin.STASH_REPOSITORY);
  }

  public Integer getPullRequestId() {
    return settings.getInt(StashPlugin.STASH_PULL_REQUEST_ID);
  }

  public String getStashURL() {
    return settings.getString(StashPlugin.STASH_URL);
  }

  public String getStashLogin() {
    return settings.getString(StashPlugin.STASH_LOGIN);
  }

  public String getStashPassword() {
    return settings.getString(StashPlugin.STASH_PASSWORD);
  }

  public String getStashPasswordEnvironmentVariable() {
    return settings.getString(StashPlugin.STASH_PASSWORD_ENVIRONMENT_VARIABLE);
  }

  public String getSonarQubeURL() {
    return settings.getString(StashPlugin.SONARQUBE_URL);
  }

  public int getIssueThreshold() {
    return settings.getInt(StashPlugin.STASH_ISSUE_THRESHOLD);
  }
  
  public int getStashTimeout() {
    return settings.getInt(StashPlugin.STASH_TIMEOUT);
  }
  
  public boolean canApprovePullRequest() {
    return settings.getBoolean(StashPlugin.STASH_REVIEWER_APPROVAL);
  }
  
  public boolean resetComments() {
    return settings.getBoolean(StashPlugin.STASH_RESET_COMMENTS);
  }
  
  public String getCodeCoverageSeverity() {
    return settings.getString(StashPlugin.STASH_CODE_COVERAGE_SEVERITY);
  }
  
  public String getTaskIssueSeverityThreshold() {
    return settings.getString(StashPlugin.STASH_TASK_SEVERITY_THRESHOLD);
  }

  public String getSonarQubeVersion() {
    return settings.getString(CoreProperties.SERVER_VERSION);
  }

  public boolean includeAnalysisOverview() {
    return settings.getBoolean(StashPlugin.STASH_INCLUDE_ANALYSIS_OVERVIEW);
  }

  public boolean includeExistingIssues() {
    return settings.getBoolean(StashPlugin.STASH_INCLUDE_EXISTING_ISSUES);
  }

  public int issueVicinityRange() {
      return settings.getInt(StashPlugin.STASH_INCLUDE_VICINITY_RANGE);
  }

  public Set<String> excludedRules() {
    return Sets.newHashSet(settings.getStringArray(StashPlugin.STASH_EXCLUDE_RULES));
  }
}