package kx0;

import com.pinterest.activity.newshub.view.header.NewsHubMultiUserAvatar;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f81092i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f81093j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f81094k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(w wVar, int i13, int i14) {
        super(2);
        this.f81092i = i14;
        this.f81093j = wVar;
        this.f81094k = i13;
    }

    public final void b(NewsHubMultiUserAvatar multiUserAvatar, GestaltText textView) {
        int i13 = this.f81092i;
        int i14 = this.f81094k;
        w wVar = this.f81093j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(multiUserAvatar, "multiUserAvatar");
                Intrinsics.checkNotNullParameter(textView, "textView");
                wVar.f81096b.a(multiUserAvatar, textView, i14);
                break;
            default:
                Intrinsics.checkNotNullParameter(multiUserAvatar, "multiUserAvatar");
                Intrinsics.checkNotNullParameter(textView, "textView");
                wVar.f81096b.a(multiUserAvatar, textView, i14);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f81092i) {
            case 0:
                b((NewsHubMultiUserAvatar) obj, (GestaltText) obj2);
                break;
            default:
                b((NewsHubMultiUserAvatar) obj, (GestaltText) obj2);
                break;
        }
        return Unit.f80348a;
    }
}
