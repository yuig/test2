package ax1;

import android.util.Log;
import androidx.lifecycle.u1;
import io.embrace.android.embracesdk.internal.ndk.jni.JniDelegateImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20639i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function0 f20640j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13, Function0 function0) {
        super(0);
        this.f20639i = i13;
        this.f20640j = function0;
    }

    public final u1 b() {
        int i13 = this.f20639i;
        Function0 function0 = this.f20640j;
        switch (i13) {
        }
        return (u1) function0.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f20639i;
        Function0 function0 = this.f20640j;
        switch (i13) {
            case 0:
                return b();
            case 1:
                return b();
            case 2:
                return b();
            case 3:
                return b();
            case 4:
                return b();
            case 5:
                return b();
            case 6:
                return b();
            case 7:
                return b();
            case 8:
                return b();
            case 9:
                return b();
            case 10:
                m46invoke();
                return Unit.f80348a;
            case 11:
                m46invoke();
                return Unit.f80348a;
            case 12:
                return b();
            case 13:
                return b();
            case 14:
                return b();
            case 15:
                return b();
            case 16:
                m46invoke();
                return Unit.f80348a;
            case 17:
                m46invoke();
                return Unit.f80348a;
            case 18:
                m46invoke();
                return Unit.f80348a;
            case 19:
                m46invoke();
                return Unit.f80348a;
            case 20:
                m46invoke();
                return Unit.f80348a;
            case 21:
                m46invoke();
                return Unit.f80348a;
            case 22:
                return b();
            case 23:
                return b();
            case 24:
                return b();
            case 25:
                m46invoke();
                return Unit.f80348a;
            case 26:
                m46invoke();
                return Unit.f80348a;
            case 27:
                JniDelegateImpl jniDelegateImpl = (JniDelegateImpl) function0.invoke();
                return jniDelegateImpl == null ? new JniDelegateImpl() : jniDelegateImpl;
            default:
                function0.invoke();
                return Boolean.FALSE;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m46invoke() {
        int i13 = this.f20639i;
        Function0 function0 = this.f20640j;
        switch (i13) {
            case 10:
                function0.invoke();
                break;
            case 11:
                function0.invoke();
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 22:
            case 23:
            case 24:
            default:
                Log.e("XRenderer", (String) function0.invoke());
                break;
            case 16:
                function0.invoke();
                break;
            case 17:
                function0.invoke();
                break;
            case 18:
                function0.invoke();
                break;
            case 19:
                function0.invoke();
                break;
            case 20:
                function0.invoke();
                break;
            case 21:
                function0.invoke();
                break;
            case 25:
                Log.i("XRenderer", (String) function0.invoke());
                break;
        }
    }
}
