package qa2;

import android.view.View;
import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class v0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103359a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f103360b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wa2.z f103361c;

    public /* synthetic */ v0(a1 a1Var, wa2.z zVar, int i13) {
        this.f103359a = i13;
        this.f103360b = a1Var;
        this.f103361c = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f103359a;
        wa2.z actionOverride = this.f103361c;
        a1 this$0 = this.f103360b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(actionOverride, "$actionOverride");
                f30 f30Var = this$0.f103228w;
                if (f30Var != null) {
                    actionOverride.f128963a.invoke(f30Var);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(actionOverride, "$override");
                f30 f30Var2 = this$0.f103228w;
                if (f30Var2 != null) {
                    actionOverride.f128963a.invoke(f30Var2);
                    break;
                }
                break;
        }
    }
}
