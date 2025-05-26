package kz0;

import android.view.View;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.y2;
import kotlin.jvm.internal.Intrinsics;
import ni1.o2;

/* loaded from: classes5.dex */
public final class k extends y2 {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f81165x = 0;

    /* renamed from: u, reason: collision with root package name */
    public final xk2.k f81166u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f81167v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f81168w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(m mVar, View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f81168w = mVar;
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new j(mVar, 0));
        this.f81166u = a13;
        if (itemView instanceof ti1.f) {
            ((ti1.f) itemView).setEventIntake(((o2) a13.getValue()).c());
            int i13 = m.f81171j;
            mVar.getClass();
            z r13 = b7.c.r(mVar);
            kotlin.jvm.internal.j.z(r13 != null ? bf.b.S(r13) : dl2.b.e(), null, null, new i(this, itemView, null), 3);
            this.f81167v = true;
        }
    }
}
