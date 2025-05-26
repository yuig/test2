package ti1;

import java.util.HashMap;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import nx.h1;

/* loaded from: classes5.dex */
public final /* synthetic */ class h implements h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117713a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f117714b;

    public /* synthetic */ h(o oVar, int i13) {
        this.f117713a = i13;
        this.f117714b = oVar;
    }

    @Override // nx.h1
    public final HashMap f() {
        int i13 = this.f117713a;
        o this$0 = this.f117714b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                return this$0.f117728b.f();
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                HashMap f13 = this$0.f117728b.f();
                if (f13 == null) {
                    return null;
                }
                Map map = this$0.f117732f;
                if (map == null) {
                    map = z0.d();
                }
                f13.putAll(map);
                return f13;
        }
    }
}
