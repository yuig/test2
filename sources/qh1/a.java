package qh1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103886a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f103887b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f103888c;

    public /* synthetic */ a(e eVar, Function0 function0, int i13) {
        this.f103886a = i13;
        this.f103887b = eVar;
        this.f103888c = function0;
    }

    @Override // ak2.a
    public final void run() {
        int i13 = this.f103886a;
        Function0 function0 = this.f103888c;
        e this$0 = this.f103887b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ep.b.C(null, this$0.f103900a);
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ep.b.C(null, this$0.f103900a);
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ep.b.C(null, this$0.f103900a);
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
        }
    }
}
