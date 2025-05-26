package j41;

import com.pinterest.feature.profile.lego.header.view.LegoUserProfileHeader;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class e implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h41.g f74646b;

    public /* synthetic */ e(h41.g gVar, int i13) {
        this.f74645a = i13;
        this.f74646b = gVar;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        int i13 = this.f74645a;
        h41.g metadata = this.f74646b;
        switch (i13) {
            case 0:
                int i14 = LegoUserProfileHeader.T;
                Intrinsics.checkNotNullParameter(metadata, "$metadata");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof rn1.f) {
                    metadata.getClass();
                    break;
                }
                break;
            default:
                int i15 = LegoUserProfileHeader.T;
                Intrinsics.checkNotNullParameter(metadata, "$metadata");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof rn1.f) {
                    metadata.f67634c.invoke();
                    break;
                }
                break;
        }
    }
}
