package j21;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import nx.v;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f74493j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f74494k = new d(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f74495i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f74495i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f74495i) {
            case 0:
                View view = (View) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                return Boolean.valueOf(view instanceof v);
            default:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
        }
    }
}
