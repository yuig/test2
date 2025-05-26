package nr;

import android.content.Context;
import android.telephony.PhoneNumberFormattingTextWatcher;
import com.pinterest.activity.user.UserImageView;
import kotlin.jvm.internal.Intrinsics;
import pw0.x;

/* loaded from: classes3.dex */
public final class i implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91851a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f91852b;

    public i(String formattingCountry) {
        Intrinsics.checkNotNullParameter(formattingCountry, "formattingCountry");
        this.f91852b = new PhoneNumberFormattingTextWatcher(formattingCountry);
    }

    @Override // gm1.a
    public final void h3(gm1.c event) {
        PhoneNumberFormattingTextWatcher phoneNumberFormattingTextWatcher;
        switch (this.f91851a) {
            case 0:
                if (event.j() == oz1.b.update_picture) {
                    UserImageView userImageView = (UserImageView) this.f91852b;
                    zp.j jVar = userImageView.f35222g;
                    Context context = userImageView.getContext();
                    x type = x.ProfilePhoto;
                    jVar.getClass();
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(type, "type");
                    zp.j.b(jVar, context, type, 0, null, null, null, 508);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(event, "event");
                if (!(event instanceof xn1.b)) {
                    if (!(event instanceof xn1.i)) {
                        if ((event instanceof xn1.a) && (phoneNumberFormattingTextWatcher = (PhoneNumberFormattingTextWatcher) this.f91852b) != null) {
                            phoneNumberFormattingTextWatcher.afterTextChanged(((xn1.a) event).f135436c);
                            break;
                        }
                    } else {
                        PhoneNumberFormattingTextWatcher phoneNumberFormattingTextWatcher2 = (PhoneNumberFormattingTextWatcher) this.f91852b;
                        if (phoneNumberFormattingTextWatcher2 != null) {
                            xn1.i iVar = (xn1.i) event;
                            phoneNumberFormattingTextWatcher2.onTextChanged(iVar.f135454c, iVar.f135455d, iVar.f135456e, iVar.f135457f);
                            break;
                        }
                    }
                } else {
                    PhoneNumberFormattingTextWatcher phoneNumberFormattingTextWatcher3 = (PhoneNumberFormattingTextWatcher) this.f91852b;
                    if (phoneNumberFormattingTextWatcher3 != null) {
                        xn1.b bVar = (xn1.b) event;
                        phoneNumberFormattingTextWatcher3.beforeTextChanged(bVar.f135438c, bVar.f135439d, bVar.f135440e, bVar.f135441f);
                        break;
                    }
                }
                break;
        }
    }

    public i(UserImageView userImageView) {
        this.f91852b = userImageView;
    }
}
