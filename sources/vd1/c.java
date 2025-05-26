package vd1;

import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import tb0.g;
import tb0.h;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f125628j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f125629k = new c(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f125630i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f125630i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f125630i;
        switch (i13) {
            case 0:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        break;
                    default:
                        HashSet hashSet = h.f117076w;
                        g.f117075a.p(th3);
                        break;
                }
                break;
            default:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        break;
                    default:
                        HashSet hashSet2 = h.f117076w;
                        g.f117075a.p(th4);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
