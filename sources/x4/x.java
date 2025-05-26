package x4;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes3.dex */
public final class x implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final y f131853a;

    /* renamed from: b, reason: collision with root package name */
    public final int f131854b;

    /* renamed from: c, reason: collision with root package name */
    public final int f131855c;

    public x(Context context, y yVar, XmlResourceParser xmlResourceParser) {
        this.f131854b = -1;
        this.f131855c = 17;
        this.f131853a = yVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.s.OnClick);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = obtainStyledAttributes.getIndex(i13);
            if (index == androidx.constraintlayout.widget.s.OnClick_targetId) {
                this.f131854b = obtainStyledAttributes.getResourceId(index, this.f131854b);
            } else if (index == androidx.constraintlayout.widget.s.OnClick_clickAction) {
                this.f131855c = obtainStyledAttributes.getInt(index, this.f131855c);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.view.View] */
    public final void a(MotionLayout motionLayout, int i13, y yVar) {
        int i14 = this.f131854b;
        MotionLayout motionLayout2 = motionLayout;
        if (i14 != -1) {
            motionLayout2 = motionLayout.findViewById(i14);
        }
        if (motionLayout2 == null) {
            Log.e("MotionScene", "OnClick could not find id " + i14);
            return;
        }
        int i15 = yVar.f131859d;
        int i16 = yVar.f131858c;
        if (i15 == -1) {
            motionLayout2.setOnClickListener(this);
            return;
        }
        int i17 = this.f131855c;
        int i18 = i17 & 1;
        if (((i18 != 0 && i13 == i15) | (i18 != 0 && i13 == i15) | ((i17 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 && i13 == i15) | ((i17 & 16) != 0 && i13 == i16)) || ((i17 & 4096) != 0 && i13 == i16)) {
            motionLayout2.setOnClickListener(this);
        }
    }

    public final void b(MotionLayout motionLayout) {
        int i13 = this.f131854b;
        if (i13 == -1) {
            return;
        }
        View findViewById = motionLayout.findViewById(i13);
        if (findViewById != null) {
            findViewById.setOnClickListener(null);
            return;
        }
        Log.e("MotionScene", " (*)  could not find id " + i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onClick(android.view.View r12) {
        /*
            r11 = this;
            kg.n.a(r12)
            x4.y r12 = r11.f131853a
            x4.z r0 = r12.f131865j
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.f131874a
            boolean r2 = r1.f17543j
            if (r2 != 0) goto Le
            return
        Le:
            int r2 = r12.f131859d
            r3 = -1
            if (r2 != r3) goto L2f
            int r2 = r1.f17535f
            if (r2 != r3) goto L1d
            int r12 = r12.f131858c
            r1.n1(r12)
            return
        L1d:
            x4.y r3 = new x4.y
            r3.<init>(r0, r12)
            r3.f131859d = r2
            int r12 = r12.f131858c
            r3.f131858c = r12
            r1.T0(r3)
            r1.b1()
            return
        L2f:
            x4.y r0 = r0.f131876c
            int r2 = r11.f131855c
            r4 = r2 & 1
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L40
            r7 = r2 & 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L3e
            goto L40
        L3e:
            r7 = r6
            goto L41
        L40:
            r7 = r5
        L41:
            r8 = r2 & 16
            if (r8 != 0) goto L4b
            r9 = r2 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L4a
            goto L4b
        L4a:
            r5 = r6
        L4b:
            if (r7 == 0) goto L64
            if (r5 == 0) goto L64
            if (r0 == r12) goto L54
            r1.T0(r12)
        L54:
            int r9 = r1.f17535f
            int r10 = r1.f17537g
            if (r9 == r10) goto L65
            float r9 = r1.f17551o
            r10 = 1056964608(0x3f000000, float:0.5)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L63
            goto L65
        L63:
            r5 = r6
        L64:
            r6 = r7
        L65:
            if (r12 != r0) goto L68
            goto L79
        L68:
            int r0 = r12.f131858c
            int r7 = r12.f131859d
            if (r7 != r3) goto L73
            int r3 = r1.f17535f
            if (r3 == r0) goto Lab
            goto L79
        L73:
            int r3 = r1.f17535f
            if (r3 == r7) goto L79
            if (r3 != r0) goto Lab
        L79:
            if (r6 == 0) goto L84
            if (r4 == 0) goto L84
            r1.T0(r12)
            r1.b1()
            goto Lab
        L84:
            r0 = 0
            if (r5 == 0) goto L90
            if (r8 == 0) goto L90
            r1.T0(r12)
            r1.d0(r0)
            goto Lab
        L90:
            if (r6 == 0) goto L9f
            r3 = r2 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L9f
            r1.T0(r12)
            r12 = 1065353216(0x3f800000, float:1.0)
            r1.K0(r12)
            goto Lab
        L9f:
            if (r5 == 0) goto Lab
            r2 = r2 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto Lab
            r1.T0(r12)
            r1.K0(r0)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.x.onClick(android.view.View):void");
    }
}
