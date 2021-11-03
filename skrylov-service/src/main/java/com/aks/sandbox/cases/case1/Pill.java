package com.aks.sandbox.cases.case1;

public class Pill {

    private long issueDate;

    private long expirationPeriod;

    public Pill(long issueDate, long expirationPeriod) {
        this.issueDate = issueDate;
        this.expirationPeriod = expirationPeriod;
    }

    public void setIssueDate(long issueDate) {
        this.issueDate = issueDate;
    }

    public long getIssueDate() {
        return issueDate;
    }

    public void setExpirationPeriod(long expirationPeriod) {
        this.expirationPeriod = expirationPeriod;
    }

    public long getExpirationPeriod() {
        return expirationPeriod;
    }

    public boolean isSpoiled() {
        if ((System.currentTimeMillis() - issueDate) > expirationPeriod) {
            return true;
        } else {
            return false;
        }
    }
}
