package fs0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lh0.l1;

/* loaded from: classes5.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public final jo1.a f62883a;

    /* renamed from: b, reason: collision with root package name */
    public final ls0.f f62884b;

    /* renamed from: c, reason: collision with root package name */
    public final l1 f62885c;

    public n(jo1.a baseFragmentType, ls0.f viewParams, l1 experiments) {
        Intrinsics.checkNotNullParameter(baseFragmentType, "baseFragmentType");
        Intrinsics.checkNotNullParameter(viewParams, "viewParams");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f62883a = baseFragmentType;
        this.f62884b = viewParams;
        this.f62885c = experiments;
    }

    public static boolean b(boolean z13, boolean z14, boolean z15) {
        return !z13 && (!z14 || z15);
    }

    public abstract List a(l lVar);

    public final boolean c() {
        jo1.a aVar = jo1.a.FOLLOWING_FEED;
        jo1.a aVar2 = this.f62883a;
        return (aVar2 == aVar || aVar2 == jo1.a.HOMEFEED) ? false : true;
    }

    public final boolean d() {
        int i13 = m.f62882a[this.f62884b.f84626a.ordinal()];
        return i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n(jo1.a r3, ls0.f r4) {
        /*
            r2 = this;
            lh0.i1 r0 = lh0.l1.f83413b
            lh0.l1 r1 = lh0.l1.f83414c
            if (r1 != 0) goto L1b
            int r1 = r0.f83387a
            switch(r1) {
                case 1: goto L11;
                case 4: goto Le;
                default: goto Lb;
            }
        Lb:
            kotlin.jvm.functions.Function0 r1 = lh0.h2.f83381d
            goto L13
        Le:
            kotlin.jvm.functions.Function0 r1 = lh0.s1.f83475d
            goto L13
        L11:
            kotlin.jvm.functions.Function0 r1 = lh0.l1.f83415d
        L13:
            r1.invoke()
            lh0.n0 r1 = lh0.n0.f83427j
            r0.c(r1)
        L1b:
            lh0.l1 r0 = lh0.l1.f83414c
            if (r0 == 0) goto L23
            r2.<init>(r3, r4, r0)
            return
        L23:
            java.lang.String r3 = "INSTANCE"
            kotlin.jvm.internal.Intrinsics.r(r3)
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: fs0.n.<init>(jo1.a, ls0.f):void");
    }
}
