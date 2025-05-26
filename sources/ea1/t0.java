package ea1;

import androidx.fragment.app.Fragment;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class t0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58137i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Fragment f58138j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(Fragment fragment, int i13) {
        super(0);
        this.f58137i = i13;
        this.f58138j = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f58137i;
        Fragment fragment = this.f58138j;
        switch (i13) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return fragment;
            case 16:
                m132invoke();
                return Unit.f80348a;
            case 17:
                m132invoke();
                return Unit.f80348a;
            case 18:
                m132invoke();
                return Unit.f80348a;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            default:
                return fragment;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m132invoke() {
        int i13 = this.f58137i;
        Fragment fragment = this.f58138j;
        switch (i13) {
            case 16:
                Method method = me.o.f87013j;
                if (method != null) {
                    method.invoke(fragment, new Object[0]);
                    break;
                }
                break;
            case 17:
                Method method2 = me.o.f87012i;
                if (method2 != null) {
                    method2.invoke(fragment, new Object[0]);
                    break;
                }
                break;
            default:
                Method method3 = me.o.f87014k;
                if (method3 != null) {
                    method3.invoke(fragment, new Object[0]);
                    break;
                }
                break;
        }
    }
}
