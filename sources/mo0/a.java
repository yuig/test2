package mo0;

import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.pinterest.api.model.db;
import com.pinterest.api.model.eb;
import com.pinterest.api.model.fb;
import com.pinterest.api.model.wy0;
import com.pinterest.design.progress.SmallLoadingView;
import cp.i;
import df.j1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import kk2.h;
import lo0.c;
import lo0.d;
import m60.e;
import m60.n0;
import m60.x0;
import uj2.b0;
import xo.j;
import xo.l;
import yk1.b;
import yk1.n;

/* loaded from: classes5.dex */
public final class a extends b implements c, lo0.a {

    /* renamed from: a, reason: collision with root package name */
    public Long f87798a;

    /* renamed from: b, reason: collision with root package name */
    public final no0.a f87799b;

    /* renamed from: c, reason: collision with root package name */
    public final fb f87800c;

    /* renamed from: d, reason: collision with root package name */
    public final b60.b f87801d;

    /* renamed from: e, reason: collision with root package name */
    public final lo0.b f87802e;

    /* renamed from: f, reason: collision with root package name */
    public final hf0.c f87803f;

    /* renamed from: g, reason: collision with root package name */
    public final e f87804g;

    public a(no0.a aVar, fb fbVar, b60.b bVar, lo0.b bVar2, hf0.b bVar3, e eVar) {
        super(0);
        this.f87798a = Long.valueOf(System.currentTimeMillis());
        this.f87799b = aVar;
        this.f87800c = fbVar;
        this.f87801d = bVar;
        this.f87802e = bVar2;
        this.f87803f = bVar3;
        this.f87804g = eVar;
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        super.r3((d) nVar);
        t3();
    }

    @Override // yk1.b
    public final void onUnbind() {
        if (this.f87800c.f37649i) {
            super.onUnbind();
            return;
        }
        u3();
        addDisposable(new h(((b0) this.f87799b.b(q3()).buildRequest()).r(tk2.e.f118017c).l(wj2.c.a()), new cp.b0(this, 13), 1).o(new l(17), new l(18)));
    }

    public final t82.b q3() {
        wy0 f13 = ((b60.d) this.f87801d).f();
        Long valueOf = f13 != null ? Long.valueOf(Long.parseLong(f13.getUid())) : null;
        fb fbVar = this.f87800c;
        Long valueOf2 = Long.valueOf(Long.parseLong(fbVar.f37641a));
        t82.e eVar = t82.e.AD;
        Boolean valueOf3 = Boolean.valueOf(!fbVar.f37649i);
        t82.a aVar = fbVar.f37644d;
        HashMap hashMap = fbVar.f37647g;
        HashMap hashMap2 = fbVar.f37648h;
        HashMap hashMap3 = fbVar.f37645e;
        ((hf0.b) this.f87803f).getClass();
        return new t82.b(valueOf, valueOf2, eVar, hashMap, hashMap2, hf0.b.a(), ((m60.d) this.f87804g).d(), valueOf3, "Legacy", aVar, hashMap3);
    }

    public final void r3(int i13) {
        d dVar = (d) getView();
        fb fbVar = this.f87800c;
        if (((eb) fbVar.f37642b.get(fbVar.f37650j)).f37226e) {
            fbVar.f37651k.clear();
            fbVar.f37646f.clear();
            oo0.c cVar = (oo0.c) dVar;
            int count = cVar.f96811f.getCount();
            for (int i14 = 0; i14 < count; i14++) {
                cVar.e(cVar.b(i14), false);
            }
            fbVar.f37651k.add(Long.valueOf(fbVar.a(i13).f36700b));
            fbVar.f37646f.put(Integer.valueOf(i13), null);
            cVar.e(cVar.b(i13), true);
        } else {
            db a13 = fbVar.a(i13);
            int i15 = 3;
            if (fbVar.f37651k.contains(Long.valueOf(fbVar.a(i13).f36700b))) {
                fbVar.f37646f.remove(Integer.valueOf(i13));
                fbVar.f37651k.remove(Long.valueOf(((db) fbVar.f37643c.get(i13)).f36700b));
                ((oo0.c) dVar).a(i13).L(new oo0.b(i15));
            } else {
                if (a13.f36701c) {
                    fbVar.f37651k.clear();
                    fbVar.f37646f.clear();
                    oo0.c cVar2 = (oo0.c) dVar;
                    int count2 = cVar2.f96811f.getCount();
                    for (int i16 = 0; i16 < count2; i16++) {
                        cVar2.a(i16).L(new oo0.b(i15));
                    }
                } else {
                    for (Integer num : fbVar.f37646f.keySet()) {
                        int intValue = num.intValue();
                        if (fbVar.a(intValue).f36701c) {
                            ((oo0.c) dVar).a(intValue).L(new oo0.b(i15));
                            fbVar.f37646f.remove(num);
                            fbVar.f37651k.remove(Long.valueOf(((db) fbVar.f37643c.get(intValue)).f36700b));
                        }
                    }
                }
                fbVar.f37651k.add(Long.valueOf(fbVar.a(i13).f36700b));
                fbVar.f37646f.put(Integer.valueOf(i13), null);
                ((oo0.c) dVar).a(i13).L(new j(29));
            }
        }
        HashMap hashMap = fbVar.f37648h;
        Long valueOf = Long.valueOf(((eb) fbVar.f37642b.get(fbVar.f37650j)).f37224c);
        HashSet hashSet = fbVar.f37651k;
        hashMap.put(valueOf, new ArrayList(Arrays.asList((Long[]) hashSet.toArray(new Long[hashSet.size()]))));
        if (fbVar.f37646f.size() > 0) {
            ((oo0.c) dVar).g(true);
        } else {
            ((oo0.c) dVar).g(false);
        }
    }

    public final void s3(int i13, boolean z13) {
        d dVar = (d) getView();
        fb fbVar = this.f87800c;
        if (z13) {
            oo0.c cVar = (oo0.c) dVar;
            cVar.b(i13).f52226a.setText(fbVar.a(i13).f36699a);
            cVar.e(cVar.b(i13), fbVar.f37646f.size() == 0 || fbVar.f37651k.contains(Long.valueOf((long) fbVar.a(i13).f36700b)));
        } else {
            oo0.c cVar2 = (oo0.c) dVar;
            cVar2.a(i13).L(new lp.l(fbVar.a(i13).f36699a, 6));
            cVar2.a(i13).L(new i(fbVar.f37651k.contains(Long.valueOf((long) fbVar.a(i13).f36700b)) ? em1.b.CHECKED : em1.b.UNCHECKED, 8));
        }
    }

    public final void t3() {
        d dVar = (d) getView();
        fb fbVar = this.f87800c;
        int i13 = 7;
        ((oo0.d) this.f87802e).f96817c.i(new lp.l(j1.X("%d of %d", Integer.valueOf(fbVar.f37650j + 1), Integer.valueOf(fbVar.f37642b.size())), i13));
        if (fbVar.f37650j + 1 == fbVar.f37642b.size()) {
            oo0.c cVar = (oo0.c) dVar;
            cVar.getClass();
            cVar.f96807b.d(new i(bs1.c.j2(new String[0], v70.c.finish), i13));
        } else {
            oo0.c cVar2 = (oo0.c) dVar;
            cVar2.getClass();
            cVar2.f96807b.d(new i(bs1.c.j2(new String[0], x0.next), i13));
        }
        oo0.c cVar3 = (oo0.c) dVar;
        cVar3.g(false);
        cVar3.f96810e.i(new lp.l(((eb) fbVar.f37642b.get(fbVar.f37650j)).f37222a, 5));
        FrameLayout frameLayout = cVar3.f96806a;
        if (frameLayout == null) {
            return;
        }
        boolean z13 = frameLayout.getChildCount() > 0;
        if (z13) {
            cVar3.startAnimation(AnimationUtils.loadAnimation(cVar3.getContext(), n0.anim_slide_out_right));
        }
        cVar3.f96806a.removeAllViews();
        int dimensionPixelSize = cVar3.getResources().getDimensionPixelSize(eo1.c.thumbnail_small_size);
        View smallLoadingView = new SmallLoadingView(cVar3.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.gravity = 17;
        com.bumptech.glide.c.a1(layoutParams, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        smallLoadingView.setLayoutParams(layoutParams);
        ListView listView = new ListView(cVar3.getContext());
        cVar3.f96811f = listView;
        listView.setEmptyView(smallLoadingView);
        cVar3.f96811f.setAdapter(cVar3.f96808c);
        cVar3.f96811f.setOnItemClickListener(cVar3.f96809d);
        cVar3.f96806a.addView(cVar3.f96811f);
        cVar3.f96806a.addView(smallLoadingView);
        if (z13) {
            cVar3.startAnimation(AnimationUtils.loadAnimation(cVar3.getContext(), n0.anim_slide_in_right_linear));
        }
        cVar3.f96813h = new HashMap();
        cVar3.f96814i = new HashMap();
    }

    public final void u3() {
        long currentTimeMillis = System.currentTimeMillis() - this.f87798a.longValue();
        fb fbVar = this.f87800c;
        Long valueOf = Long.valueOf(((eb) fbVar.f37642b.get(fbVar.f37650j)).f37224c);
        HashMap hashMap = fbVar.f37645e;
        Long l13 = (Long) hashMap.get(valueOf);
        if (l13 == null) {
            l13 = 0L;
        }
        hashMap.put(valueOf, Long.valueOf(l13.longValue() + currentTimeMillis));
        this.f87798a = Long.valueOf(System.currentTimeMillis());
    }
}
