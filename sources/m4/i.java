package m4;

import android.os.Bundle;
import androidx.core.widget.NestedScrollView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i implements androidx.core.widget.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85796a;

    public i() {
        this.f85796a = 13;
    }

    public final Bundle a(String registrationResponseJson) {
        switch (this.f85796a) {
            case 19:
                Intrinsics.checkNotNullParameter(registrationResponseJson, "registrationResponseJson");
                Bundle bundle = new Bundle();
                bundle.putString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON", registrationResponseJson);
                return bundle;
            default:
                Intrinsics.checkNotNullParameter(registrationResponseJson, "authenticationResponseJson");
                Bundle bundle2 = new Bundle();
                bundle2.putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", registrationResponseJson);
                return bundle2;
        }
    }

    @Override // androidx.core.widget.i
    public final void h(NestedScrollView nestedScrollView, int i13, int i14) {
    }

    public /* synthetic */ i(int i13) {
        this.f85796a = i13;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i13, int i14) {
        this(0);
        this.f85796a = i13;
        switch (i13) {
            case 1:
                this(1);
                break;
            case 2:
                this(2);
                break;
            case 3:
                this(3);
                break;
            case 4:
                this(4);
                break;
            case 5:
                this(5);
                break;
            case 6:
                this(6);
                break;
            case 7:
                this(7);
                break;
            case 8:
                this(8);
                break;
            case 9:
                this(9);
                break;
            case 10:
                this(10);
                break;
            case 11:
                this(11);
                break;
            case 12:
                this(12);
                break;
            case 13:
            default:
                break;
            case 14:
                this(14);
                break;
            case 15:
                this(15);
                break;
            case 16:
                this(16);
                break;
            case 17:
                this(17);
                break;
            case 18:
                this(18);
                break;
            case 19:
                this(19);
                break;
            case 20:
                this(20);
                break;
            case 21:
                this(21);
                break;
            case 22:
                this(22);
                break;
            case 23:
                this(23);
                break;
            case 24:
                this(24);
                break;
            case 25:
                this(25);
                break;
            case 26:
                this(26);
                break;
            case 27:
                this(27);
                break;
            case 28:
                this(28);
                break;
            case 29:
                this(29);
                break;
        }
    }
}
