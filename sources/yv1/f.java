package yv1;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f140230b;

    public /* synthetic */ f(j jVar, int i13) {
        this.f140229a = i13;
        this.f140230b = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f140229a;
        j this$0 = this.f140230b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                xv1.l lVar = this$0.f140241i;
                if (lVar != null) {
                    lVar.r3(false);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                xv1.l lVar2 = this$0.f140241i;
                if (lVar2 != null) {
                    lVar2.r3(false);
                    break;
                }
                break;
        }
    }
}
