package net.matthieuclam.skinswitch.util;

public class PacketLimiter {

    //public static MinecraftClient client = MinecraftClient.getInstance();

    private boolean packetLimiter = true;

    /*
    public static void toggleSkin(PlayerModelPart[] modelParts) {
        for(PlayerModelPart modelPart : modelParts) {
            if (modelPart != PlayerModelPart.CAPE) {
                client.options.togglePlayerModelPart(modelPart, !client.options.isPlayerModelPartEnabled(modelPart));
            }
        }
    }

    public static void hideSkin(PlayerModelPart[] modelParts) {
        for(PlayerModelPart modelPart : modelParts) {
            if (modelPart != PlayerModelPart.CAPE) {
                client.options.togglePlayerModelPart(modelPart, false);
            }
        }
    }
     */

    public boolean getPacketLimiter() {
        return this.packetLimiter;
    }

    public void setPacketLimiter(boolean limiter) {
        this.packetLimiter = limiter;
    }

}