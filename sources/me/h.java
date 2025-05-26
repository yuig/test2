package me;

import android.content.Context;
import android.util.Log;
import df.j1;
import java.io.BufferedOutputStream;
import java.io.ObjectOutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f86986a;

    static {
        String name = h.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "AppEventDiskStore::class.java.name");
        f86986a = name;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009f A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:13:0x0025, B:15:0x0028, B:18:0x009f, B:24:0x0036, B:44:0x0074, B:46:0x0077, B:47:0x0089, B:50:0x0082, B:37:0x005e, B:39:0x0061, B:42:0x006c, B:34:0x0070, B:28:0x008a, B:30:0x008d, B:33:0x0098), top: B:3:0x0003, inners: #4, #5, #6, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final synchronized me.t a() {
        /*
            java.lang.Class<me.h> r0 = me.h.class
            monitor-enter(r0)
            android.content.Context r1 = le.v.a()     // Catch: java.lang.Throwable -> L32
            r2 = 0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch: java.io.FileNotFoundException -> L51 java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r4 = "context.openFileInput(PERSISTED_EVENTS_FILENAME)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)     // Catch: java.io.FileNotFoundException -> L51 java.lang.Throwable -> L53 java.lang.Exception -> L55
            me.g r4 = new me.g     // Catch: java.io.FileNotFoundException -> L51 java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.io.FileNotFoundException -> L51 java.lang.Throwable -> L53 java.lang.Exception -> L55
            r5.<init>(r3)     // Catch: java.io.FileNotFoundException -> L51 java.lang.Throwable -> L53 java.lang.Exception -> L55
            r4.<init>(r5)     // Catch: java.io.FileNotFoundException -> L51 java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.Object r3 = r4.readObject()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42 java.io.FileNotFoundException -> L8a
            if (r3 == 0) goto L44
            me.t r3 = (me.t) r3     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42 java.io.FileNotFoundException -> L8a
            df.j1.z(r4)     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L35
            r1.delete()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L35
            goto L3d
        L32:
            r1 = move-exception
            goto La6
        L35:
            r1 = move-exception
            java.lang.String r2 = me.h.f86986a     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r2, r4, r1)     // Catch: java.lang.Throwable -> L32
        L3d:
            r2 = r3
            goto L9d
        L40:
            r2 = move-exception
            goto L74
        L42:
            r3 = move-exception
            goto L57
        L44:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42 java.io.FileNotFoundException -> L8a
            java.lang.String r5 = "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents"
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42 java.io.FileNotFoundException -> L8a
            throw r3     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42 java.io.FileNotFoundException -> L8a
        L4c:
            r4 = r2
            r2 = r3
            goto L74
        L4f:
            r4 = r2
            goto L57
        L51:
            r4 = r2
            goto L8a
        L53:
            r3 = move-exception
            goto L4c
        L55:
            r3 = move-exception
            goto L4f
        L57:
            java.lang.String r5 = me.h.f86986a     // Catch: java.lang.Throwable -> L40
            java.lang.String r6 = "Got unexpected exception while reading events: "
            android.util.Log.w(r5, r6, r3)     // Catch: java.lang.Throwable -> L40
            df.j1.z(r4)     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L6b
            r1.delete()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L6b
            goto L9d
        L6b:
            r1 = move-exception
            java.lang.String r3 = me.h.f86986a     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = "Got unexpected exception when removing events file: "
        L70:
            android.util.Log.w(r3, r4, r1)     // Catch: java.lang.Throwable -> L32
            goto L9d
        L74:
            df.j1.z(r4)     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L81
            r1.delete()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L81
            goto L89
        L81:
            r1 = move-exception
            java.lang.String r3 = me.h.f86986a     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r3, r4, r1)     // Catch: java.lang.Throwable -> L32
        L89:
            throw r2     // Catch: java.lang.Throwable -> L32
        L8a:
            df.j1.z(r4)     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L97
            r1.delete()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L97
            goto L9d
        L97:
            r1 = move-exception
            java.lang.String r3 = me.h.f86986a     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            goto L70
        L9d:
            if (r2 != 0) goto La4
            me.t r2 = new me.t     // Catch: java.lang.Throwable -> L32
            r2.<init>()     // Catch: java.lang.Throwable -> L32
        La4:
            monitor-exit(r0)
            return r2
        La6:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: me.h.a():me.t");
    }

    public static final void b(t tVar) {
        Context a13 = le.v.a();
        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(a13.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream2.writeObject(tVar);
                j1.z(objectOutputStream2);
            } catch (Throwable th3) {
                th = th3;
                objectOutputStream = objectOutputStream2;
                try {
                    Log.w(f86986a, "Got unexpected exception while persisting events: ", th);
                    try {
                        a13.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception unused) {
                    }
                } finally {
                    j1.z(objectOutputStream);
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
