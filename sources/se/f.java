package se;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112331a;

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f112332b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f112333c;

    public f(g this$0, Runnable runnable, int i13) {
        this.f112331a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f112333c = this$0;
            this.f112332b = runnable;
            return;
        }
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f112333c = this$0;
        this.f112332b = runnable;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047 A[Catch: Exception -> 0x000f, all -> 0x004a, TryCatch #1 {Exception -> 0x000f, blocks: (B:11:0x0019, B:17:0x002c, B:20:0x003c, B:22:0x0047, B:25:0x0050, B:28:0x0065, B:31:0x0074, B:33:0x0086, B:40:0x0083, B:46:0x0061, B:55:0x0038, B:60:0x0028), top: B:10:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x000f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.util.List r9) {
        /*
            r8 = this;
            java.lang.String r0 = "productId"
            java.lang.Class<se.g> r1 = se.g.class
            boolean r2 = p001if.a.b(r8)
            if (r2 == 0) goto Lb
            return
        Lb:
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L4a
        Lf:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L99
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L4a
            boolean r3 = p001if.a.b(r1)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            se.g r4 = r8.f112333c
            r5 = 0
            if (r3 == 0) goto L24
        L22:
            r3 = r5
            goto L2c
        L24:
            java.lang.Class r3 = r4.f112346g     // Catch: java.lang.Throwable -> L27
            goto L2c
        L27:
            r3 = move-exception
            p001if.a.a(r1, r3)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            goto L22
        L2c:
            boolean r6 = p001if.a.b(r1)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            if (r6 == 0) goto L34
        L32:
            r6 = r5
            goto L3c
        L34:
            java.lang.reflect.Method r6 = r4.f112353n     // Catch: java.lang.Throwable -> L37
            goto L3c
        L37:
            r6 = move-exception
            p001if.a.a(r1, r6)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            goto L32
        L3c:
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            java.lang.Object r2 = se.l.h(r3, r2, r6, r7)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            if (r3 == 0) goto L4c
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            goto L4d
        L4a:
            r9 = move-exception
            goto L9f
        L4c:
            r2 = r5
        L4d:
            if (r2 != 0) goto L50
            goto Lf
        L50:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            r3.<init>(r2)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            boolean r2 = p001if.a.b(r1)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            if (r2 == 0) goto L5d
        L5b:
            r2 = r5
            goto L65
        L5d:
            android.content.Context r2 = r4.f112340a     // Catch: java.lang.Throwable -> L60
            goto L65
        L60:
            r2 = move-exception
            p001if.a.a(r1, r2)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            goto L5b
        L65:
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            java.lang.String r6 = "packageName"
            r3.put(r6, r2)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            boolean r2 = r3.has(r0)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            if (r2 == 0) goto Lf
            java.lang.String r2 = r3.getString(r0)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            boolean r6 = p001if.a.b(r1)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            if (r6 == 0) goto L7f
            goto L86
        L7f:
            java.util.concurrent.CopyOnWriteArraySet r5 = r4.f112357r     // Catch: java.lang.Throwable -> L82
            goto L86
        L82:
            r4 = move-exception
            p001if.a.a(r1, r4)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
        L86:
            r5.add(r2)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            me.f r4 = se.g.f112334s     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            java.util.concurrent.ConcurrentHashMap r4 = me.f.m()     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            java.lang.String r5 = "skuID"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            r4.put(r2, r3)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            goto Lf
        L99:
            java.lang.Runnable r9 = r8.f112332b     // Catch: java.lang.Throwable -> L4a
            r9.run()     // Catch: java.lang.Throwable -> L4a
            return
        L9f:
            p001if.a.a(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: se.f.a(java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c A[Catch: Exception -> 0x0014, all -> 0x004f, TryCatch #3 {Exception -> 0x0014, blocks: (B:11:0x001e, B:17:0x0031, B:20:0x0041, B:22:0x004c, B:25:0x0055, B:28:0x0060, B:30:0x0074, B:37:0x0071, B:47:0x003d, B:52:0x002d), top: B:10:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.List r8) {
        /*
            r7 = this;
            java.lang.String r0 = "productId"
            java.lang.Class<se.g> r1 = se.g.class
            boolean r2 = p001if.a.b(r7)
            if (r2 == 0) goto Lb
            return
        Lb:
            java.lang.String r2 = "skuDetailsObjectList"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)     // Catch: java.lang.Throwable -> L4f
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L4f
        L14:
            boolean r2 = r8.hasNext()     // Catch: java.lang.Throwable -> L4f
            if (r2 == 0) goto L7d
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> L4f
            boolean r3 = p001if.a.b(r1)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            r4 = 0
            se.g r5 = r7.f112333c
            if (r3 == 0) goto L29
        L27:
            r3 = r4
            goto L31
        L29:
            java.lang.Class r3 = r5.f112345f     // Catch: java.lang.Throwable -> L2c
            goto L31
        L2c:
            r3 = move-exception
            p001if.a.a(r1, r3)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            goto L27
        L31:
            boolean r6 = p001if.a.b(r1)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            if (r6 == 0) goto L39
        L37:
            r5 = r4
            goto L41
        L39:
            java.lang.reflect.Method r5 = r5.f112352m     // Catch: java.lang.Throwable -> L3c
            goto L41
        L3c:
            r5 = move-exception
            p001if.a.a(r1, r5)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            goto L37
        L41:
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            java.lang.Object r2 = se.l.h(r3, r2, r5, r6)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            if (r3 == 0) goto L51
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            goto L52
        L4f:
            r8 = move-exception
            goto L83
        L51:
            r2 = r4
        L52:
            if (r2 != 0) goto L55
            goto L14
        L55:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            r3.<init>(r2)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            boolean r2 = r3.has(r0)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            if (r2 == 0) goto L14
            java.lang.String r2 = r3.getString(r0)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            me.f r5 = se.g.f112334s     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            boolean r5 = p001if.a.b(r1)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            if (r5 == 0) goto L6d
            goto L74
        L6d:
            java.util.concurrent.ConcurrentHashMap r4 = se.g.f112339x     // Catch: java.lang.Throwable -> L70
            goto L74
        L70:
            r5 = move-exception
            p001if.a.a(r1, r5)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
        L74:
            java.lang.String r5 = "skuID"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            r4.put(r2, r3)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L4f
            goto L14
        L7d:
            java.lang.Runnable r8 = r7.f112332b     // Catch: java.lang.Throwable -> L4f
            r8.run()     // Catch: java.lang.Throwable -> L4f
            return
        L83:
            p001if.a.a(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: se.f.b(java.util.List):void");
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object proxy, Method method, Object[] objArr) {
        switch (this.f112331a) {
            case 0:
                if (!p001if.a.b(this)) {
                    try {
                        Intrinsics.checkNotNullParameter(proxy, "proxy");
                        Intrinsics.checkNotNullParameter(method, "method");
                        if (Intrinsics.d(method.getName(), "onPurchaseHistoryResponse")) {
                            Object obj = objArr == null ? null : objArr[1];
                            if (obj != null && (obj instanceof List)) {
                                a((List) obj);
                                break;
                            }
                        }
                    } catch (Throwable th3) {
                        p001if.a.a(this, th3);
                        break;
                    }
                }
                break;
            default:
                if (!p001if.a.b(this)) {
                    try {
                        Intrinsics.checkNotNullParameter(proxy, "proxy");
                        Intrinsics.checkNotNullParameter(method, "m");
                        if (Intrinsics.d(method.getName(), "onSkuDetailsResponse")) {
                            Object obj2 = objArr == null ? null : objArr[1];
                            if (obj2 != null && (obj2 instanceof List)) {
                                b((List) obj2);
                                break;
                            }
                        }
                    } catch (Throwable th4) {
                        p001if.a.a(this, th4);
                        break;
                    }
                }
                break;
        }
        return null;
        return null;
    }
}
