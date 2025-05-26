package p62;

import com.pinterest.shuffles.composer.ui.widget.ZOrderIndicator;
import kotlin.jvm.internal.Intrinsics;
import rl2.u;

/* loaded from: classes4.dex */
public final class h extends nl2.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98932b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ZOrderIndicator f98933c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(ZOrderIndicator zOrderIndicator, int i13) {
        super(0);
        this.f98932b = i13;
        this.f98933c = zOrderIndicator;
    }

    @Override // nl2.a
    public final void a(Object obj, u property, Object obj2) {
        int i13 = this.f98932b;
        ZOrderIndicator zOrderIndicator = this.f98933c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(property, "property");
                if (((Number) obj).intValue() != ((Number) obj2).intValue()) {
                    zOrderIndicator.postInvalidate();
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(property, "property");
                if (((Number) obj).intValue() != ((Number) obj2).intValue()) {
                    zOrderIndicator.postInvalidate();
                    break;
                }
                break;
        }
    }
}
