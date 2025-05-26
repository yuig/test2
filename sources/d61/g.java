package d61;

import android.view.View;
import com.pinterest.gestalt.searchField.GestaltStaticSearchBar;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import p1.v0;

/* loaded from: classes5.dex */
public final class g extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ GestaltStaticSearchBar f53774i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ View f53775j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f53776k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f53777l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(GestaltStaticSearchBar gestaltStaticSearchBar, View view, int i13, float f13) {
        super(0);
        this.f53774i = gestaltStaticSearchBar;
        this.f53775j = view;
        this.f53776k = i13;
        this.f53777l = f13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f53774i.d0(new v0(11, this.f53777l));
        this.f53775j.getBackground().setAlpha(this.f53776k);
        return Unit.f80348a;
    }
}
