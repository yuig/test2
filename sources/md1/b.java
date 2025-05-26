package md1;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.pinterest.gestalt.text.GestaltText;
import hs.d;
import kotlin.jvm.internal.Intrinsics;
import ll.j;
import nx.v;
import so.jb;
import ye2.o;
import yk1.n;

/* loaded from: classes5.dex */
public final class b extends FrameLayout implements n, v, af2.c {

    /* renamed from: a, reason: collision with root package name */
    public o f86956a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f86957b;

    /* renamed from: c, reason: collision with root package name */
    public final j f86958c;

    /* renamed from: d, reason: collision with root package name */
    public int f86959d;

    /* renamed from: e, reason: collision with root package name */
    public int f86960e;

    /* renamed from: f, reason: collision with root package name */
    public String f86961f;

    /* renamed from: g, reason: collision with root package name */
    public String f86962g;

    /* renamed from: h, reason: collision with root package name */
    public final d f86963h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f86964i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        j storyImpressionHelper = new j(16, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(storyImpressionHelper, "storyImpressionHelper");
        if (!this.f86957b) {
            this.f86957b = true;
            this.f86963h = ((jb) ((c) generatedComponent())).f113485c.a6();
        }
        this.f86958c = storyImpressionHelper;
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(a.f86955i);
        addView(gestaltText);
        this.f86964i = gestaltText;
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.space_400);
        d dVar = this.f86963h;
        if (dVar != null) {
            setPaddingRelative(dimensionPixelSize, dVar.b() ? bs1.c.W(this, eo1.c.space_300) : bs1.c.W(this, eo1.c.space_600), dimensionPixelSize, bs1.c.W(this, eo1.c.space_100));
        } else {
            Intrinsics.r("moduleViewabilityHelper");
            throw null;
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f86956a == null) {
            this.f86956a = new o(this);
        }
        return this.f86956a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f86956a == null) {
            this.f86956a = new o(this);
        }
        return this.f86956a.generatedComponent();
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        String str = this.f86961f;
        if (str == null) {
            return null;
        }
        return j.x(this.f86958c, str, this.f86960e, 0, this.f86962g, null, null, 52);
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        return this.f86958c.y(Integer.valueOf(this.f86959d));
    }
}
