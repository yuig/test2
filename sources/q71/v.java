package q71;

import android.text.style.StyleSpan;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final v f102769j = new v(0);

    /* renamed from: k, reason: collision with root package name */
    public static final v f102770k = new v(1);

    /* renamed from: l, reason: collision with root package name */
    public static final v f102771l = new v(2);

    /* renamed from: m, reason: collision with root package name */
    public static final v f102772m = new v(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f102773i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i13) {
        super(0);
        this.f102773i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f102773i;
        switch (i13) {
            case 0:
                return vb0.i.f();
            case 1:
                switch (i13) {
                    case 1:
                        return "SearchTypeaheadPinCarousel";
                    default:
                        return "SearchTypeaheadRecentSearchesCarouselView";
                }
            case 2:
                switch (i13) {
                    case 1:
                        return "SearchTypeaheadPinCarousel";
                    default:
                        return "SearchTypeaheadRecentSearchesCarouselView";
                }
            default:
                return new StyleSpan(1);
        }
    }
}
