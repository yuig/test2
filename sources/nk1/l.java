package nk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91143a;

    /* renamed from: b, reason: collision with root package name */
    public final i92.k f91144b;

    public l(i92.k toastUtils, int i13) {
        this.f91143a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
            this.f91144b = toastUtils;
        } else {
            Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
            this.f91144b = toastUtils;
        }
    }

    public final f2.o a(boolean z13) {
        switch (this.f91143a) {
            case 0:
                return new f2.o(this, z13, 2);
            default:
                return new f2.o(this, z13, 3);
        }
    }
}
