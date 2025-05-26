package rq;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class z3 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j4 f109685b;

    public /* synthetic */ z3(j4 j4Var, int i13) {
        this.f109684a = i13;
        this.f109685b = j4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f109684a;
        j4 this$0 = this.f109685b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                i01.q qVar = this$0.f109319s;
                if (qVar != null) {
                    ((w01.m0) qVar).w3(c.Comment);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                i01.q qVar2 = this$0.f109319s;
                if (qVar2 != null) {
                    ((w01.m0) qVar2).w3(c.Comment);
                    break;
                }
                break;
        }
    }
}
