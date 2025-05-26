package ck0;

import android.widget.FrameLayout;
import androidx.recyclerview.widget.w;
import bq0.e;
import bq0.f;
import bq0.g;
import bq0.h;
import bs1.c;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import wt1.u;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27902i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f27903j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f27904k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13, int i14, int i15) {
        super(1);
        this.f27902i = i15;
        this.f27903j = i13;
        this.f27904k = i14;
    }

    public final void b(FrameLayout.LayoutParams lparamsFrame) {
        int i13 = this.f27902i;
        int i14 = this.f27904k;
        int i15 = this.f27903j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(lparamsFrame, "$this$lparamsFrame");
                lparamsFrame.width = i15;
                lparamsFrame.height = i14;
                lparamsFrame.gravity = 17;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(lparamsFrame, "$this$lparamsFrame");
                lparamsFrame.width = i15;
                lparamsFrame.height = i14;
                lparamsFrame.gravity = 17;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(lparamsFrame, "$this$lparamsFrame");
                lparamsFrame.width = i15;
                lparamsFrame.height = i14;
                lparamsFrame.gravity = 17;
                break;
            default:
                Intrinsics.checkNotNullParameter(lparamsFrame, "$this$lparamsFrame");
                lparamsFrame.width = i15;
                lparamsFrame.height = i14;
                lparamsFrame.gravity = 17;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f27902i;
        int i14 = this.f27904k;
        int i15 = this.f27903j;
        switch (i13) {
            case 0:
                ao1.b it = (ao1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, null, c.j2(new String[0], i14), null, c.j2(new String[0], i15), null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194285);
            case 1:
                Pair notificationTitle = (Pair) obj;
                Intrinsics.checkNotNullParameter(notificationTitle, "notificationTitle");
                ArrayList arrayList = new ArrayList();
                arrayList.add(new f(i15));
                arrayList.add(new e(notificationTitle));
                arrayList.add(new f(i14));
                arrayList.add(h.f23692e);
                arrayList.add(g.f23690e);
                return arrayList;
            case 2:
                b((FrameLayout.LayoutParams) obj);
                return Unit.f80348a;
            case 3:
                b((FrameLayout.LayoutParams) obj);
                return Unit.f80348a;
            case 4:
                b((FrameLayout.LayoutParams) obj);
                return Unit.f80348a;
            case 5:
                b((FrameLayout.LayoutParams) obj);
                return Unit.f80348a;
            default:
                w diffResult = (w) obj;
                Intrinsics.checkNotNullParameter(diffResult, "diffResult");
                return new u(diffResult, i15, i14);
        }
    }
}
