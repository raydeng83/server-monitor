package com.visiant.server.monitor.domain;

public class StatusEntity {
    private String serverName;
    private boolean alive;
    private boolean authnTokenAvailable;
    private boolean oAuthTokenAvailable;
    private boolean samlTokenAvailable;

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean isAuthnTokenAvailable() {
        return authnTokenAvailable;
    }

    public void setAuthnTokenAvailable(boolean authnTokenAvailable) {
        this.authnTokenAvailable = authnTokenAvailable;
    }

    public boolean isoAuthTokenAvailable() {
        return oAuthTokenAvailable;
    }

    public void setoAuthTokenAvailable(boolean oAuthTokenAvailable) {
        this.oAuthTokenAvailable = oAuthTokenAvailable;
    }

    public boolean isSamlTokenAvailable() {
        return samlTokenAvailable;
    }

    public void setSamlTokenAvailable(boolean samlTokenAvailable) {
        this.samlTokenAvailable = samlTokenAvailable;
    }

    @Override
    public String toString() {
        return "StatusEntity{" +
                "serverName='" + serverName + '\'' +
                ", alive=" + alive +
                ", authnTokenAvailable=" + authnTokenAvailable +
                ", oAuthTokenAvailable=" + oAuthTokenAvailable +
                ", samlTokenAvailable=" + samlTokenAvailable +
                '}';
    }
}
