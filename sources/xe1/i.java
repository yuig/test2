package xe1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i extends f {

    /* renamed from: h, reason: collision with root package name */
    public final e f134727h;

    /* renamed from: i, reason: collision with root package name */
    public final j f134728i;

    /* renamed from: j, reason: collision with root package name */
    public final g f134729j;

    /* renamed from: k, reason: collision with root package name */
    public final g f134730k;

    /* renamed from: l, reason: collision with root package name */
    public final a f134731l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e spec, j avatarStackViewModel, g cardTitleViewModel, g buttonTextViewModel, a backgroundViewModel) {
        super(spec, d.f134691a, backgroundViewModel, avatarStackViewModel, buttonTextViewModel, cardTitleViewModel, null, 64);
        Intrinsics.checkNotNullParameter(spec, "spec");
        Intrinsics.checkNotNullParameter(avatarStackViewModel, "avatarStackViewModel");
        Intrinsics.checkNotNullParameter(cardTitleViewModel, "cardTitleViewModel");
        Intrinsics.checkNotNullParameter(buttonTextViewModel, "buttonTextViewModel");
        Intrinsics.checkNotNullParameter(backgroundViewModel, "backgroundViewModel");
        this.f134727h = spec;
        this.f134728i = avatarStackViewModel;
        this.f134729j = cardTitleViewModel;
        this.f134730k = buttonTextViewModel;
        this.f134731l = backgroundViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f134727h, iVar.f134727h) && Intrinsics.d(this.f134728i, iVar.f134728i) && Intrinsics.d(this.f134729j, iVar.f134729j) && Intrinsics.d(this.f134730k, iVar.f134730k) && Intrinsics.d(this.f134731l, iVar.f134731l);
    }

    public final int hashCode() {
        return this.f134731l.hashCode() + ((this.f134730k.hashCode() + ((this.f134729j.hashCode() + ((this.f134728i.hashCode() + (this.f134727h.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AvatarStackCardActionStyleModel(spec=" + this.f134727h + ", avatarStackViewModel=" + this.f134728i + ", cardTitleViewModel=" + this.f134729j + ", buttonTextViewModel=" + this.f134730k + ", backgroundViewModel=" + this.f134731l + ")";
    }
}
