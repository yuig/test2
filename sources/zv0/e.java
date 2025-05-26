package zv0;

import android.view.View;
import com.pinterest.feature.ideaPinCreation.videotrimming.view.IdeaPinVideoTrimmingDragger;
import kh2.k3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142868i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ IdeaPinVideoTrimmingDragger f142869j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(IdeaPinVideoTrimmingDragger ideaPinVideoTrimmingDragger, int i13) {
        super(0);
        this.f142868i = i13;
        this.f142869j = ideaPinVideoTrimmingDragger;
    }

    public final View b() {
        int i13 = this.f142868i;
        IdeaPinVideoTrimmingDragger ideaPinVideoTrimmingDragger = this.f142869j;
        switch (i13) {
            case 0:
                View findViewById = ideaPinVideoTrimmingDragger.a().findViewById(aq1.d.left_shadow);
                Intrinsics.f(findViewById);
                k3.Z1(findViewById, 1, ideaPinVideoTrimmingDragger.f46427e);
                return findViewById;
            default:
                View findViewById2 = ideaPinVideoTrimmingDragger.a().findViewById(aq1.d.right_shadow);
                Intrinsics.f(findViewById2);
                k3.Z1(findViewById2, 2, ideaPinVideoTrimmingDragger.f46427e);
                return findViewById2;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f142868i) {
        }
        return b();
    }
}
