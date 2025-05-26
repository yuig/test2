package vg0;

import com.pinterest.experience.banner.view.MultiPlatformBanner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f125783i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ MultiPlatformBanner f125784j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(MultiPlatformBanner multiPlatformBanner, int i13) {
        super(0);
        this.f125783i = i13;
        this.f125784j = multiPlatformBanner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f125783i) {
            case 0:
                m275invoke();
                break;
            case 1:
                m275invoke();
                break;
            default:
                m275invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m275invoke() {
        int i13 = this.f125783i;
        MultiPlatformBanner multiPlatformBanner = this.f125784j;
        switch (i13) {
            case 0:
                int i14 = MultiPlatformBanner.D;
                multiPlatformBanner.getClass();
                break;
            case 1:
                int i15 = MultiPlatformBanner.D;
                multiPlatformBanner.getClass();
                break;
            default:
                int i16 = MultiPlatformBanner.D;
                multiPlatformBanner.getClass();
                break;
        }
    }
}
