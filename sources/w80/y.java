package w80;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f128428i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function0 f128429j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function0 f128430k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function0 f128431l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function0 f128432m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Function0 f128433n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, int i13) {
        super(1);
        this.f128428i = i13;
        this.f128429j = function0;
        this.f128430k = function02;
        this.f128431l = function03;
        this.f128432m = function04;
        this.f128433n = function05;
    }

    public final void b(int i13) {
        int i14 = this.f128428i;
        Function0 function0 = this.f128433n;
        Function0 function02 = this.f128432m;
        Function0 function03 = this.f128431l;
        Function0 function04 = this.f128430k;
        Function0 function05 = this.f128429j;
        switch (i14) {
            case 0:
                if (i13 != z.f128439e.f128277d) {
                    if (i13 != z.f128440f.f128277d) {
                        if (i13 != z.f128441g.f128277d) {
                            if (i13 != z.f128442h.f128277d) {
                                if (i13 == z.f128443i.f128277d) {
                                    function0.invoke();
                                    break;
                                }
                            } else {
                                function02.invoke();
                                break;
                            }
                        } else {
                            function03.invoke();
                            break;
                        }
                    } else {
                        function04.invoke();
                        break;
                    }
                } else {
                    function05.invoke();
                    break;
                }
                break;
            case 1:
                if (i13 != a1.f128248a.f128291d) {
                    if (i13 != a1.f128249b.f128291d) {
                        if (i13 != a1.f128250c.f128291d) {
                            if (i13 != a1.f128251d.f128291d) {
                                if (i13 == a1.f128252e.f128291d) {
                                    function0.invoke();
                                    break;
                                }
                            } else {
                                function02.invoke();
                                break;
                            }
                        } else {
                            function03.invoke();
                            break;
                        }
                    } else {
                        function04.invoke();
                        break;
                    }
                } else {
                    function05.invoke();
                    break;
                }
                break;
            default:
                if (i13 != om0.f.f96490a.f96458c) {
                    if (i13 != om0.f.f96491b.f96458c) {
                        if (i13 != om0.f.f96492c.f96458c) {
                            if (i13 != om0.f.f96493d.f96458c) {
                                if (i13 == om0.f.f96494e.f96458c) {
                                    function0.invoke();
                                    break;
                                }
                            } else {
                                function02.invoke();
                                break;
                            }
                        } else {
                            function03.invoke();
                            break;
                        }
                    } else {
                        function04.invoke();
                        break;
                    }
                } else {
                    function05.invoke();
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f128428i) {
            case 0:
                b(((Number) obj).intValue());
                break;
            case 1:
                b(((Number) obj).intValue());
                break;
            default:
                b(((Number) obj).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
