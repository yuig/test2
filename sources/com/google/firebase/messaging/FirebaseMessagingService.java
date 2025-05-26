package com.google.firebase.messaging;

import android.content.Intent;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
public class FirebaseMessagingService extends g {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0295 A[Catch: RuntimeException -> 0x02ba, TryCatch #9 {RuntimeException -> 0x02ba, blocks: (B:110:0x027b, B:112:0x0295, B:113:0x02bc, B:114:0x02cb), top: B:109:0x027b }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02bc A[Catch: RuntimeException -> 0x02ba, TryCatch #9 {RuntimeException -> 0x02ba, blocks: (B:110:0x027b, B:112:0x0295, B:113:0x02bc, B:114:0x02cb), top: B:109:0x027b }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.content.Intent r33) {
        /*
            Method dump skipped, instructions count: 846
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.c(android.content.Intent):void");
    }

    @Override // com.google.firebase.messaging.g
    public Intent getStartCommandIntent(Intent intent) {
        return (Intent) ((Queue) q.n().f33806d).poll();
    }

    @Override // com.google.firebase.messaging.g
    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if (ACTION_REMOTE_INTENT.equals(action) || ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            c(intent);
        } else {
            if (ACTION_NEW_TOKEN.equals(action)) {
                onNewToken(intent.getStringExtra(EXTRA_TOKEN));
                return;
            }
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
        }
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
    }

    public void onMessageSent(@NonNull String str) {
    }

    public void onNewToken(@NonNull String str) {
    }

    public void onSendError(@NonNull String str, @NonNull Exception exc) {
    }
}
