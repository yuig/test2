package we1;

import android.view.View;
import com.pinterest.api.model.v7;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class n implements View.OnLongClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129488a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f129489b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f129490c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f129491d;

    public /* synthetic */ n(ue1.f fVar, int i13, xv.g gVar) {
        this.f129490c = fVar;
        this.f129489b = i13;
        this.f129491d = gVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i13 = this.f129488a;
        int i14 = this.f129489b;
        Object obj = this.f129491d;
        Object obj2 = this.f129490c;
        switch (i13) {
            case 0:
                ue1.f model = (ue1.f) obj2;
                xv.g this$0 = (xv.g) obj;
                Intrinsics.checkNotNullParameter(model, "$model");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ka2.b bVar = model.f122001b;
                v7 v7Var = model.f122000a;
                bVar.r0(i14, v7Var);
                Function2 function2 = (Function2) this$0.f136005c;
                Intrinsics.f(view);
                function2.invoke(v7Var, view);
                break;
            default:
                yo0.a this$02 = (yo0.a) obj2;
                v7 model2 = (v7) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(model2, "$model");
                ((ka2.b) this$02.f139599f).r0(i14, model2);
                Function2 function22 = (Function2) this$02.f139595b;
                Intrinsics.f(view);
                function22.invoke(model2, view);
                break;
        }
        return true;
    }

    public /* synthetic */ n(yo0.a aVar, v7 v7Var, int i13) {
        this.f129490c = aVar;
        this.f129491d = v7Var;
        this.f129489b = i13;
    }
}
