package y31;

import android.view.View;
import com.pinterest.feature.profile.header.UserProfileHeader;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h extends cf0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136797a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserProfileHeader f136798b;

    public h(UserProfileHeader userProfileHeader, int i13) {
        this.f136797a = i13;
        this.f136798b = userProfileHeader;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        int i13 = this.f136797a;
        UserProfileHeader userProfileHeader = this.f136798b;
        switch (i13) {
            case 0:
                kg.n.a(widget);
                Intrinsics.checkNotNullParameter(widget, "widget");
                u50.r rVar = userProfileHeader.f47531q;
                if (rVar != null) {
                    rVar.a(v.f136858a);
                    break;
                }
                break;
            case 1:
                kg.n.a(widget);
                Intrinsics.checkNotNullParameter(widget, "widget");
                u50.r rVar2 = userProfileHeader.f47531q;
                if (rVar2 != null) {
                    rVar2.a(w.f136859a);
                    break;
                }
                break;
            default:
                kg.n.a(widget);
                Intrinsics.checkNotNullParameter(widget, "widget");
                u50.r rVar3 = userProfileHeader.f47531q;
                if (rVar3 != null) {
                    rVar3.a(b0.f136776a);
                    break;
                }
                break;
        }
    }
}
