package com.visiant.server.monitor.domain;

public class StatusEntity {
    private String serverName;
    private State alive;
    private State authnTokenAvailable;
    private State oAuthTokenAvailable;
    private State samlTokenAvailable;

    public StatusEntity() {
        this.alive=State.NOTAVAILABLE;
        this.authnTokenAvailable=State.NOTAVAILABLE;
        this.oAuthTokenAvailable=State.NOTAVAILABLE;
        this.samlTokenAvailable=State.NOTAVAILABLE;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public State getAlive() {
        return alive;
    }

    public void setAlive(State alive) {
        this.alive = alive;
    }

    public State getAuthnTokenAvailable() {
        return authnTokenAvailable;
    }

    public void setAuthnTokenAvailable(State authnTokenAvailable) {
        this.authnTokenAvailable = authnTokenAvailable;
    }

    public State getoAuthTokenAvailable() {
        return oAuthTokenAvailable;
    }

    public void setoAuthTokenAvailable(State oAuthTokenAvailable) {
        this.oAuthTokenAvailable = oAuthTokenAvailable;
    }

    public State getSamlTokenAvailable() {
        return samlTokenAvailable;
    }

    public void setSamlTokenAvailable(State samlTokenAvailable) {
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
