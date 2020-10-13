package com.tennisbowling.richpresence;

public static void main(String[] args) {
    IPCClient client = new IPCClient(345229890980937739L);
client.setListener(new IPCListener(){
    
client.connect();
}

public void onReady(IPCClient client)
    {
        RichPresence.Builder builder = new RichPresence.Builder();
        builder.setState("state")
            .setDetails("details")
            .setStartTimestamp(OffsetDateTime.now())
            .setLargeImage("canary-large", "Discord Canary")
            .setSmallImage("")
            .setParty("party1234", 1, 6)
            .setMatchSecret("xyzzy")
            .setJoinSecret("join")
            .setSpectateSecret("look");
        client.sendRichPresence(builder.build());
    }
});