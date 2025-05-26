package iq1;

import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import tb0.g;
import tb0.h;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f73416j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f73417k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f73418l = new b(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f73419i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f73419i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f73419i;
        switch (i13) {
            case 0:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        HashSet hashSet = h.f117076w;
                        g.f117075a.p(th3);
                        break;
                }
                break;
            case 1:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        HashSet hashSet2 = h.f117076w;
                        g.f117075a.p(th4);
                        break;
                }
                break;
            default:
                Throwable th5 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        HashSet hashSet3 = h.f117076w;
                        g.f117075a.p(th5);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
