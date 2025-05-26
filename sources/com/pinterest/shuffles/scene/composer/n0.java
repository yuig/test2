package com.pinterest.shuffles.scene.composer;

import android.content.Context;
import ao2.i1;
import ao2.p2;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final long f52105f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f52106g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f52107h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f52108i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f52109a;

    /* renamed from: b, reason: collision with root package name */
    public final ao2.j0 f52110b;

    /* renamed from: c, reason: collision with root package name */
    public final n72.m f52111c;

    /* renamed from: d, reason: collision with root package name */
    public final Function2 f52112d;

    /* renamed from: e, reason: collision with root package name */
    public final i1 f52113e;

    static {
        zn2.a aVar = zn2.b.f142311b;
        zn2.d dVar = zn2.d.SECONDS;
        f52105f = dl2.b.P2(45, dVar);
        f52106g = dl2.b.P2(10, dVar);
        f52107h = dl2.b.P2(30, dVar);
    }

    public n0(Context context, ao2.j0 coroutineScope, n72.m coreLogger, jq1.b offscreenAdapterProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(coreLogger, "coreLogger");
        Intrinsics.checkNotNullParameter(offscreenAdapterProvider, "offscreenAdapterProvider");
        this.f52109a = context;
        this.f52110b = coroutineScope;
        this.f52111c = coreLogger;
        this.f52112d = offscreenAdapterProvider;
        this.f52113e = new i1(Executors.newScheduledThreadPool(1, new p2(a.a.d("OffscreenRendererThread-", hashCode()), new AtomicInteger())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:13:0x0030, B:14:0x0089, B:21:0x009b, B:23:0x00b4, B:25:0x00d8), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d8 A[Catch: all -> 0x0034, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:13:0x0030, B:14:0x0089, B:21:0x009b, B:23:0x00b4, B:25:0x00d8), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0042  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.pinterest.shuffles.scene.composer.s0] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.pinterest.shuffles.scene.composer.n0] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List r13, android.util.Size r14, int r15, r72.e2 r16, bl2.c r17) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.shuffles.scene.composer.n0.a(java.util.List, android.util.Size, int, r72.e2, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x019b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(com.pinterest.shuffles.scene.composer.u r19, android.util.Size r20, java.util.List r21, int r22, r72.e2 r23, bl2.c r24) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.shuffles.scene.composer.n0.b(com.pinterest.shuffles.scene.composer.u, android.util.Size, java.util.List, int, r72.e2, bl2.c):java.lang.Object");
    }
}
