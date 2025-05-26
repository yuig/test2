package wa2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;

/* loaded from: classes4.dex */
public final class u extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Context f128943a;

    /* renamed from: b, reason: collision with root package name */
    public List f128944b;

    /* renamed from: c, reason: collision with root package name */
    public final int f128945c;

    /* renamed from: d, reason: collision with root package name */
    public int f128946d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f128947e;

    public u(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f128943a = context;
        this.f128944b = q0.f80391a;
        this.f128945c = context.getResources().getDimensionPixelSize(cz1.a.pin_reaction_inline_icon_size);
        this.f128946d = context.getResources().getDimensionPixelSize(r0.margin_quarter);
        List list = b21.b.f21287a;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((b21.a) it.next()).f21286h);
        }
        this.f128947e = arrayList;
    }

    public static void a(u uVar, Map reactionCounts, v32.c reactionByMe, boolean z13, int i13) {
        int i14 = 0;
        if ((i13 & 4) != 0) {
            z13 = false;
        }
        boolean z14 = (i13 & 8) != 0;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(reactionCounts, "reactionCounts");
        Intrinsics.checkNotNullParameter(reactionByMe, "reactionByMe");
        Context context = uVar.f128943a;
        if (z13) {
            if (reactionByMe == v32.c.NONE) {
                reactionByMe = v32.c.LIKE;
            }
            uVar.f128944b = kotlin.collections.f0.k(kh2.w.M(context, reactionByMe));
        } else {
            Set entrySet = reactionCounts.entrySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : entrySet) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() != v32.c.NONE && ((Number) entry.getValue()).intValue() > 0) {
                    arrayList.add(obj);
                }
            }
            List x03 = CollectionsKt.x0(arrayList, new s4.g(uVar, 9));
            ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(x03, 10));
            Iterator it = x03.iterator();
            while (it.hasNext()) {
                arrayList2.add((v32.c) ((Map.Entry) it.next()).getKey());
            }
            ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                int i15 = i14 + 1;
                Drawable drawable = null;
                if (i14 < 0) {
                    kotlin.collections.f0.p();
                    throw null;
                }
                v32.c cVar = (v32.c) next;
                if (i14 < 3) {
                    drawable = z14 ? kh2.w.M(context, cVar) : kh2.w.G(context, cVar, null);
                }
                arrayList3.add(drawable);
                i14 = i15;
            }
            uVar.f128944b = CollectionsKt.Q(arrayList3);
        }
        uVar.setBounds(uVar.getBounds().left, uVar.getBounds().top, uVar.getIntrinsicWidth() + uVar.getBounds().left, uVar.getBounds().top + uVar.f128945c);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float f13 = getBounds().left;
        float f14 = getBounds().top;
        for (Drawable drawable : this.f128944b) {
            canvas.save();
            canvas.translate(f13, f14);
            int i13 = this.f128945c;
            drawable.setBounds(0, 0, i13, i13);
            drawable.draw(canvas);
            f13 += i13 + this.f128946d;
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f128945c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f128944b.size() * (this.f128945c + this.f128946d);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
