package d92;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final z82.a f54164b;

    /* renamed from: c, reason: collision with root package name */
    public final y82.h f54165c;

    /* renamed from: d, reason: collision with root package name */
    public final m60.f0 f54166d;

    /* renamed from: e, reason: collision with root package name */
    public final rw1.f f54167e;

    /* renamed from: f, reason: collision with root package name */
    public final z82.b f54168f;

    /* renamed from: g, reason: collision with root package name */
    public final es.h f54169g;

    public m0(z82.a handshakeHeaderManager, y82.h handshakeAnalytics, m60.f0 handshakeEventGenerator, rw1.f handshakeBottomSheetStateTransformer, z82.b handshakeManager, es.h adsCommonDisplay) {
        Intrinsics.checkNotNullParameter(handshakeHeaderManager, "handshakeHeaderManager");
        Intrinsics.checkNotNullParameter(handshakeAnalytics, "handshakeAnalytics");
        Intrinsics.checkNotNullParameter(handshakeEventGenerator, "handshakeEventGenerator");
        Intrinsics.checkNotNullParameter(handshakeBottomSheetStateTransformer, "handshakeBottomSheetStateTransformer");
        Intrinsics.checkNotNullParameter(handshakeManager, "handshakeManager");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        this.f54164b = handshakeHeaderManager;
        this.f54165c = handshakeAnalytics;
        this.f54166d = handshakeEventGenerator;
        this.f54167e = handshakeBottomSheetStateTransformer;
        this.f54168f = handshakeManager;
        this.f54169g = adsCommonDisplay;
    }

    public static g0 g(zy.a aVar) {
        return new g0(new zy.e0(aVar));
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        n0 vmState = (n0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        c92.w wVar = vmState.f54177g;
        this.f54167e.getClass();
        l82.c0 h10 = rw1.f.h(wVar);
        return new l82.c0(new i(new ArrayList(), a.None, (c92.o) h10.f82212a), n0.b(vmState, null, 0L, 0L, null, null, null, (c92.w) h10.f82213b, null, RecyclerViewTypes.VIEW_TYPE_LENS_PHOTO), q0.f80391a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02dd  */
    @Override // l82.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l82.c0 f(u50.s r73, u50.o r74, l82.i0 r75, l82.e r76) {
        /*
            Method dump skipped, instructions count: 1982
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d92.m0.f(u50.s, u50.o, l82.i0, l82.e):l82.c0");
    }
}
