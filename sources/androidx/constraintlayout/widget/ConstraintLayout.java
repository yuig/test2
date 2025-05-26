package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.1.4";
    private static u sSharedValues;
    SparseArray<View> mChildrenByIds;
    private ArrayList<ConstraintHelper> mConstraintHelpers;
    protected i mConstraintLayoutSpec;
    private p mConstraintSet;
    private int mConstraintSetId;
    private q mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected u4.i mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    f mMeasurer;
    private s4.e mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<u4.h> mTempMapIdToWidget;

    public ConstraintLayout(Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new u4.i();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = RecyclerViewTypes.VIEW_TYPE_COMMENT_STICKER;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new f(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        C(null, 0, 0);
    }

    public static u getSharedValues() {
        if (sSharedValues == null) {
            sSharedValues = new u();
        }
        return sSharedValues;
    }

    public final void C(AttributeSet attributeSet, int i13, int i14) {
        u4.i iVar = this.mLayoutWidget;
        iVar.f120211h0 = this;
        f fVar = this.mMeasurer;
        iVar.f120246z0 = fVar;
        iVar.f120244x0.f123988h = fVar;
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.ConstraintLayout_Layout, i13, i14);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i15 = 0; i15 < indexCount; i15++) {
                int index = obtainStyledAttributes.getIndex(i15);
                if (index == s.ConstraintLayout_Layout_android_minWidth) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == s.ConstraintLayout_Layout_android_minHeight) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == s.ConstraintLayout_Layout_android_maxWidth) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == s.ConstraintLayout_Layout_android_maxHeight) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == s.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == s.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == s.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        p pVar = new p();
                        this.mConstraintSet = pVar;
                        pVar.y(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        u4.i iVar2 = this.mLayoutWidget;
        iVar2.I0 = this.mOptimizationLevel;
        s4.d.f111074p = iVar2.n0(BitmapUtils.BITMAP_TO_JPEG_SIZE);
    }

    public final void D(u4.h hVar, LayoutParams layoutParams, SparseArray sparseArray, int i13, u4.d dVar) {
        View view = this.mChildrenByIds.get(i13);
        u4.h hVar2 = (u4.h) sparseArray.get(i13);
        if (hVar2 == null || view == null || !(view.getLayoutParams() instanceof LayoutParams)) {
            return;
        }
        layoutParams.f17660c0 = true;
        u4.d dVar2 = u4.d.BASELINE;
        if (dVar == dVar2) {
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            layoutParams2.f17660c0 = true;
            layoutParams2.f17688q0.E = true;
        }
        hVar.l(dVar2).b(hVar2.l(dVar), layoutParams.D, layoutParams.C, true);
        hVar.E = true;
        hVar.l(u4.d.TOP).l();
        hVar.l(u4.d.BOTTOM).l();
    }

    public final u4.h a(int i13) {
        if (i13 == 0) {
            return this.mLayoutWidget;
        }
        View view = this.mChildrenByIds.get(i13);
        if (view == null && (view = findViewById(i13)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f17688q0;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x02b1 -> B:75:0x02b2). Please report as a decompilation issue!!! */
    public void applyConstraintsFromLayoutParams(boolean z13, View view, u4.h hVar, LayoutParams layoutParams, SparseArray<u4.h> sparseArray) {
        float f13;
        u4.h hVar2;
        u4.h hVar3;
        u4.h hVar4;
        u4.h hVar5;
        int i13;
        int i14;
        float f14;
        int i15;
        layoutParams.a();
        hVar.f120213i0 = view.getVisibility();
        if (layoutParams.f17666f0) {
            hVar.F = true;
            hVar.f120213i0 = 8;
        }
        hVar.f120211h0 = view;
        if (view instanceof ConstraintHelper) {
            ((ConstraintHelper) view).p(hVar, this.mLayoutWidget.A0);
        }
        int i16 = -1;
        if (layoutParams.f17662d0) {
            u4.m mVar = (u4.m) hVar;
            int i17 = layoutParams.f17682n0;
            int i18 = layoutParams.f17684o0;
            float f15 = layoutParams.f17686p0;
            if (f15 != -1.0f) {
                mVar.m0(f15);
                return;
            } else if (i17 != -1) {
                mVar.k0(i17);
                return;
            } else {
                if (i18 != -1) {
                    mVar.l0(i18);
                    return;
                }
                return;
            }
        }
        int i19 = layoutParams.f17668g0;
        int i23 = layoutParams.f17670h0;
        int i24 = layoutParams.f17672i0;
        int i25 = layoutParams.f17674j0;
        int i26 = layoutParams.f17676k0;
        int i27 = layoutParams.f17678l0;
        float f16 = layoutParams.f17680m0;
        int i28 = layoutParams.f17685p;
        if (i28 != -1) {
            u4.h hVar6 = sparseArray.get(i28);
            if (hVar6 != null) {
                hVar.h(hVar6, layoutParams.f17689r, layoutParams.f17687q);
            }
            f13 = 0.0f;
        } else {
            if (i19 != -1) {
                u4.h hVar7 = sparseArray.get(i19);
                if (hVar7 != null) {
                    u4.d dVar = u4.d.LEFT;
                    f13 = 0.0f;
                    hVar.D(dVar, hVar7, dVar, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i26);
                } else {
                    f13 = 0.0f;
                }
            } else {
                f13 = 0.0f;
                if (i23 != -1 && (hVar2 = sparseArray.get(i23)) != null) {
                    hVar.D(u4.d.LEFT, hVar2, u4.d.RIGHT, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i26);
                }
            }
            if (i24 != -1) {
                u4.h hVar8 = sparseArray.get(i24);
                if (hVar8 != null) {
                    hVar.D(u4.d.RIGHT, hVar8, u4.d.LEFT, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i27);
                }
            } else if (i25 != -1 && (hVar3 = sparseArray.get(i25)) != null) {
                u4.d dVar2 = u4.d.RIGHT;
                hVar.D(dVar2, hVar3, dVar2, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i27);
            }
            int i29 = layoutParams.f17671i;
            if (i29 != -1) {
                u4.h hVar9 = sparseArray.get(i29);
                if (hVar9 != null) {
                    u4.d dVar3 = u4.d.TOP;
                    hVar.D(dVar3, hVar9, dVar3, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f17695x);
                }
            } else {
                int i33 = layoutParams.f17673j;
                if (i33 != -1 && (hVar4 = sparseArray.get(i33)) != null) {
                    hVar.D(u4.d.TOP, hVar4, u4.d.BOTTOM, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f17695x);
                }
            }
            int i34 = layoutParams.f17675k;
            if (i34 != -1) {
                u4.h hVar10 = sparseArray.get(i34);
                if (hVar10 != null) {
                    hVar.D(u4.d.BOTTOM, hVar10, u4.d.TOP, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f17697z);
                }
            } else {
                int i35 = layoutParams.f17677l;
                if (i35 != -1 && (hVar5 = sparseArray.get(i35)) != null) {
                    u4.d dVar4 = u4.d.BOTTOM;
                    hVar.D(dVar4, hVar5, dVar4, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f17697z);
                }
            }
            int i36 = layoutParams.f17679m;
            if (i36 != -1) {
                D(hVar, layoutParams, sparseArray, i36, u4.d.BASELINE);
            } else {
                int i37 = layoutParams.f17681n;
                if (i37 != -1) {
                    D(hVar, layoutParams, sparseArray, i37, u4.d.TOP);
                } else {
                    int i38 = layoutParams.f17683o;
                    if (i38 != -1) {
                        D(hVar, layoutParams, sparseArray, i38, u4.d.BOTTOM);
                    }
                }
            }
            if (f16 >= f13) {
                hVar.f120207f0 = f16;
            }
            float f17 = layoutParams.F;
            if (f17 >= f13) {
                hVar.f120209g0 = f17;
            }
        }
        if (z13 && ((i15 = layoutParams.T) != -1 || layoutParams.U != -1)) {
            hVar.Y(i15, layoutParams.U);
        }
        if (layoutParams.f17656a0) {
            hVar.X(u4.g.FIXED);
            hVar.b0(((ViewGroup.MarginLayoutParams) layoutParams).width);
            if (((ViewGroup.MarginLayoutParams) layoutParams).width == -2) {
                hVar.X(u4.g.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1) {
            if (layoutParams.W) {
                hVar.X(u4.g.MATCH_CONSTRAINT);
            } else {
                hVar.X(u4.g.MATCH_PARENT);
            }
            hVar.l(u4.d.LEFT).f120190g = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            hVar.l(u4.d.RIGHT).f120190g = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            hVar.X(u4.g.MATCH_CONSTRAINT);
            hVar.b0(0);
        }
        if (layoutParams.f17658b0) {
            hVar.a0(u4.g.FIXED);
            hVar.W(((ViewGroup.MarginLayoutParams) layoutParams).height);
            if (((ViewGroup.MarginLayoutParams) layoutParams).height == -2) {
                hVar.a0(u4.g.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
            if (layoutParams.X) {
                hVar.a0(u4.g.MATCH_CONSTRAINT);
            } else {
                hVar.a0(u4.g.MATCH_PARENT);
            }
            hVar.l(u4.d.TOP).f120190g = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            hVar.l(u4.d.BOTTOM).f120190g = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        } else {
            hVar.a0(u4.g.MATCH_CONSTRAINT);
            hVar.W(0);
        }
        String str = layoutParams.G;
        if (str == null || str.length() == 0) {
            hVar.Y = f13;
        } else {
            int length = str.length();
            int indexOf = str.indexOf(44);
            if (indexOf <= 0 || indexOf >= length - 1) {
                i13 = 1;
                i14 = 0;
            } else {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i16 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i13 = 1;
                    i16 = 1;
                    i14 = indexOf + i13;
                }
                i13 = 1;
                i14 = indexOf + i13;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - i13) {
                String substring2 = str.substring(i14);
                if (substring2.length() > 0) {
                    f14 = Float.parseFloat(substring2);
                }
                f14 = f13;
            } else {
                String substring3 = str.substring(i14, indexOf2);
                String substring4 = str.substring(indexOf2 + i13);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    float parseFloat = Float.parseFloat(substring3);
                    float parseFloat2 = Float.parseFloat(substring4);
                    if (parseFloat > f13 && parseFloat2 > f13) {
                        f14 = i16 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                    }
                }
                f14 = f13;
            }
            if (f14 > f13) {
                hVar.Y = f14;
                hVar.Z = i16;
            }
        }
        float f18 = layoutParams.H;
        float[] fArr = hVar.f120225o0;
        fArr[0] = f18;
        fArr[1] = layoutParams.I;
        hVar.f120221m0 = layoutParams.f17654J;
        hVar.f120223n0 = layoutParams.K;
        int i39 = layoutParams.Z;
        if (i39 >= 0 && i39 <= 3) {
            hVar.f120228q = i39;
        }
        int i43 = layoutParams.L;
        int i44 = layoutParams.N;
        int i45 = layoutParams.P;
        float f19 = layoutParams.R;
        hVar.f120230r = i43;
        hVar.f120236u = i44;
        if (i45 == Integer.MAX_VALUE) {
            i45 = 0;
        }
        hVar.f120238v = i45;
        hVar.f120239w = f19;
        if (f19 > f13 && f19 < 1.0f && i43 == 0) {
            hVar.f120230r = 2;
        }
        int i46 = layoutParams.M;
        int i47 = layoutParams.O;
        int i48 = layoutParams.Q;
        float f23 = layoutParams.S;
        hVar.f120232s = i46;
        hVar.f120240x = i47;
        hVar.f120241y = i48 != Integer.MAX_VALUE ? i48 : 0;
        hVar.f120242z = f23;
        if (f23 <= f13 || f23 >= 1.0f || i46 != 0) {
            return;
        }
        hVar.f120232s = 2;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                this.mConstraintHelpers.get(i13).u(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i15 = (int) ((parseInt / 1080.0f) * width);
                        int i16 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f13 = i15;
                        float f14 = i16;
                        float f15 = i15 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f13, f14, f15, f14, paint);
                        float parseInt4 = i16 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f15, f14, f15, parseInt4, paint);
                        canvas.drawLine(f15, parseInt4, f13, parseInt4, paint);
                        canvas.drawLine(f13, parseInt4, f13, f14, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f13, f14, f15, parseInt4, paint);
                        canvas.drawLine(f13, parseInt4, f15, f14, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(s4.e eVar) {
        this.mLayoutWidget.B0.getClass();
    }

    @Override // android.view.View
    public void forceLayout() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        super.forceLayout();
    }

    public Object getDesignInformation(int i13, Object obj) {
        if (i13 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.mDesignIds;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.I0;
    }

    public String getSceneString() {
        int id3;
        StringBuilder sb3 = new StringBuilder();
        if (this.mLayoutWidget.f120214j == null) {
            int id4 = getId();
            if (id4 != -1) {
                this.mLayoutWidget.f120214j = getContext().getResources().getResourceEntryName(id4);
            } else {
                this.mLayoutWidget.f120214j = "parent";
            }
        }
        u4.i iVar = this.mLayoutWidget;
        if (iVar.f120217k0 == null) {
            iVar.f120217k0 = iVar.f120214j;
            Log.v(TAG, " setDebugName " + this.mLayoutWidget.f120217k0);
        }
        Iterator it = this.mLayoutWidget.f120284v0.iterator();
        while (it.hasNext()) {
            u4.h hVar = (u4.h) it.next();
            View view = (View) hVar.f120211h0;
            if (view != null) {
                if (hVar.f120214j == null && (id3 = view.getId()) != -1) {
                    hVar.f120214j = getContext().getResources().getResourceEntryName(id3);
                }
                if (hVar.f120217k0 == null) {
                    hVar.f120217k0 = hVar.f120214j;
                    Log.v(TAG, " setDebugName " + hVar.f120217k0);
                }
            }
        }
        this.mLayoutWidget.u(sb3);
        return sb3.toString();
    }

    public View getViewById(int i13) {
        return this.mChildrenByIds.get(i13);
    }

    public final u4.h getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).f17688q0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).f17688q0;
        }
        return null;
    }

    public boolean isRtl() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public void loadLayoutDescription(int i13) {
        if (i13 == 0) {
            this.mConstraintLayoutSpec = null;
            return;
        }
        try {
            this.mConstraintLayoutSpec = new i(getContext(), this, i13);
        } catch (Resources.NotFoundException unused) {
            this.mConstraintLayoutSpec = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        View a13;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            u4.h hVar = layoutParams.f17688q0;
            if ((childAt.getVisibility() != 8 || layoutParams.f17662d0 || layoutParams.f17664e0 || isInEditMode) && !layoutParams.f17666f0) {
                int z14 = hVar.z();
                int A = hVar.A();
                int y13 = hVar.y() + z14;
                int o13 = hVar.o() + A;
                childAt.layout(z14, A, y13, o13);
                if ((childAt instanceof Placeholder) && (a13 = ((Placeholder) childAt).a()) != null) {
                    a13.setVisibility(0);
                    a13.layout(z14, A, y13, o13);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i18 = 0; i18 < size; i18++) {
                this.mConstraintHelpers.get(i18).t();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i13, int i14) {
        if (this.mOnMeasureWidthMeasureSpec == i13) {
            int i15 = this.mOnMeasureHeightMeasureSpec;
        }
        boolean z13 = true;
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            int i16 = 0;
            while (true) {
                if (i16 >= childCount) {
                    break;
                }
                if (getChildAt(i16).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
                i16++;
            }
        }
        this.mOnMeasureWidthMeasureSpec = i13;
        this.mOnMeasureHeightMeasureSpec = i14;
        this.mLayoutWidget.A0 = isRtl();
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            int childCount2 = getChildCount();
            int i17 = 0;
            while (true) {
                if (i17 >= childCount2) {
                    z13 = false;
                    break;
                } else if (getChildAt(i17).isLayoutRequested()) {
                    break;
                } else {
                    i17++;
                }
            }
            if (z13) {
                boolean isInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i18 = 0; i18 < childCount3; i18++) {
                    u4.h viewWidget = getViewWidget(getChildAt(i18));
                    if (viewWidget != null) {
                        viewWidget.L();
                    }
                }
                if (isInEditMode) {
                    for (int i19 = 0; i19 < childCount3; i19++) {
                        View childAt = getChildAt(i19);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                            int indexOf = resourceName.indexOf(47);
                            if (indexOf != -1) {
                                resourceName = resourceName.substring(indexOf + 1);
                            }
                            a(childAt.getId()).S(resourceName);
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (this.mConstraintSetId != -1) {
                    for (int i23 = 0; i23 < childCount3; i23++) {
                        View childAt2 = getChildAt(i23);
                        if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof Constraints)) {
                            this.mConstraintSet = ((Constraints) childAt2).a();
                        }
                    }
                }
                p pVar = this.mConstraintSet;
                if (pVar != null) {
                    pVar.c(this);
                }
                this.mLayoutWidget.f120284v0.clear();
                int size = this.mConstraintHelpers.size();
                if (size > 0) {
                    for (int i24 = 0; i24 < size; i24++) {
                        this.mConstraintHelpers.get(i24).v(this);
                    }
                }
                for (int i25 = 0; i25 < childCount3; i25++) {
                    View childAt3 = getChildAt(i25);
                    if (childAt3 instanceof Placeholder) {
                        ((Placeholder) childAt3).d(this);
                    }
                }
                this.mTempMapIdToWidget.clear();
                this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
                this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
                for (int i26 = 0; i26 < childCount3; i26++) {
                    View childAt4 = getChildAt(i26);
                    this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
                }
                for (int i27 = 0; i27 < childCount3; i27++) {
                    View childAt5 = getChildAt(i27);
                    u4.h viewWidget2 = getViewWidget(childAt5);
                    if (viewWidget2 != null) {
                        LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
                        u4.i iVar = this.mLayoutWidget;
                        iVar.f120284v0.add(viewWidget2);
                        u4.h hVar = viewWidget2.V;
                        if (hVar != null) {
                            ((u4.s) hVar).g0(viewWidget2);
                        }
                        viewWidget2.V = iVar;
                        applyConstraintsFromLayoutParams(isInEditMode, childAt5, viewWidget2, layoutParams, this.mTempMapIdToWidget);
                    }
                }
            }
            if (z13) {
                u4.i iVar2 = this.mLayoutWidget;
                iVar2.f120243w0.U(iVar2);
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i13, i14);
        int y13 = this.mLayoutWidget.y();
        int o13 = this.mLayoutWidget.o();
        u4.i iVar3 = this.mLayoutWidget;
        resolveMeasuredDimension(i13, i14, y13, o13, iVar3.J0, iVar3.K0);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        u4.h viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof u4.m)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            u4.m mVar = new u4.m();
            layoutParams.f17688q0 = mVar;
            layoutParams.f17662d0 = true;
            mVar.n0(layoutParams.V);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.x();
            ((LayoutParams) view.getLayoutParams()).f17664e0 = true;
            if (!this.mConstraintHelpers.contains(constraintHelper)) {
                this.mConstraintHelpers.add(constraintHelper);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.g0(getViewWidget(view));
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int i13) {
        this.mConstraintLayoutSpec = new i(getContext(), this, i13);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int i13, int i14, int i15, int i16, boolean z13, boolean z14) {
        f fVar = this.mMeasurer;
        int i17 = fVar.f17732e;
        int resolveSizeAndState = View.resolveSizeAndState(i15 + fVar.f17731d, i13, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i16 + i17, i14, 0) & 16777215;
        int min = Math.min(this.mMaxWidth, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.mMaxHeight, resolveSizeAndState2);
        if (z13) {
            min |= 16777216;
        }
        if (z14) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.mLastMeasureWidth = min;
        this.mLastMeasureHeight = min2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0134  */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void resolveSystem(u4.i r22, int r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 1593
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.resolveSystem(u4.i, int, int, int):void");
    }

    public void setConstraintSet(p pVar) {
        this.mConstraintSet = pVar;
    }

    public void setDesignInformation(int i13, Object obj, Object obj2) {
        if (i13 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.mDesignIds.put(str, num);
        }
    }

    @Override // android.view.View
    public void setId(int i13) {
        this.mChildrenByIds.remove(getId());
        super.setId(i13);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i13) {
        if (i13 == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i13;
        requestLayout();
    }

    public void setMaxWidth(int i13) {
        if (i13 == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i13;
        requestLayout();
    }

    public void setMinHeight(int i13) {
        if (i13 == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i13;
        requestLayout();
    }

    public void setMinWidth(int i13) {
        if (i13 == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i13;
        requestLayout();
    }

    public void setOnConstraintsChanged(q qVar) {
        i iVar = this.mConstraintLayoutSpec;
        if (iVar != null) {
            iVar.getClass();
        }
    }

    public void setOptimizationLevel(int i13) {
        this.mOptimizationLevel = i13;
        u4.i iVar = this.mLayoutWidget;
        iVar.I0 = i13;
        s4.d.f111074p = iVar.n0(BitmapUtils.BITMAP_TO_JPEG_SIZE);
    }

    public void setSelfDimensionBehaviour(u4.i iVar, int i13, int i14, int i15, int i16) {
        u4.g gVar;
        f fVar = this.mMeasurer;
        int i17 = fVar.f17732e;
        int i18 = fVar.f17731d;
        u4.g gVar2 = u4.g.FIXED;
        int childCount = getChildCount();
        if (i13 == Integer.MIN_VALUE) {
            gVar = u4.g.WRAP_CONTENT;
            if (childCount == 0) {
                i14 = Math.max(0, this.mMinWidth);
            }
        } else if (i13 == 0) {
            gVar = u4.g.WRAP_CONTENT;
            if (childCount == 0) {
                i14 = Math.max(0, this.mMinWidth);
            }
            i14 = 0;
        } else if (i13 != 1073741824) {
            gVar = gVar2;
            i14 = 0;
        } else {
            i14 = Math.min(this.mMaxWidth - i18, i14);
            gVar = gVar2;
        }
        if (i15 == Integer.MIN_VALUE) {
            gVar2 = u4.g.WRAP_CONTENT;
            if (childCount == 0) {
                i16 = Math.max(0, this.mMinHeight);
            }
        } else if (i15 != 0) {
            if (i15 == 1073741824) {
                i16 = Math.min(this.mMaxHeight - i17, i16);
            }
            i16 = 0;
        } else {
            gVar2 = u4.g.WRAP_CONTENT;
            if (childCount == 0) {
                i16 = Math.max(0, this.mMinHeight);
            }
            i16 = 0;
        }
        if (i14 != iVar.y() || i16 != iVar.o()) {
            iVar.f120244x0.f123982b = true;
        }
        iVar.f120197a0 = 0;
        iVar.f120199b0 = 0;
        int i19 = this.mMaxWidth - i18;
        int[] iArr = iVar.C;
        iArr[0] = i19;
        iArr[1] = this.mMaxHeight - i17;
        iVar.f120203d0 = 0;
        iVar.f120205e0 = 0;
        iVar.X(gVar);
        iVar.b0(i14);
        iVar.a0(gVar2);
        iVar.W(i16);
        int i23 = this.mMinWidth - i18;
        if (i23 < 0) {
            iVar.f120203d0 = 0;
        } else {
            iVar.f120203d0 = i23;
        }
        int i24 = this.mMinHeight - i17;
        if (i24 < 0) {
            iVar.f120205e0 = 0;
        } else {
            iVar.f120205e0 = i24;
        }
    }

    public void setState(int i13, int i14, int i15) {
        i iVar = this.mConstraintLayoutSpec;
        if (iVar != null) {
            iVar.b(i14, i15, i13);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public ConstraintLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new u4.i();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = RecyclerViewTypes.VIEW_TYPE_COMMENT_STICKER;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new f(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        C(attributeSet, 0, 0);
    }

    public ConstraintLayout(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new u4.i();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = RecyclerViewTypes.VIEW_TYPE_COMMENT_STICKER;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new f(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        C(attributeSet, i13, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13, i14);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new u4.i();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = RecyclerViewTypes.VIEW_TYPE_COMMENT_STICKER;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new f(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        C(attributeSet, i13, i14);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public final int C;
        public final int D;
        public float E;
        public float F;
        public String G;
        public float H;
        public float I;

        /* renamed from: J, reason: collision with root package name */
        public int f17654J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public float R;
        public float S;
        public int T;
        public int U;
        public int V;
        public boolean W;
        public boolean X;
        public String Y;
        public int Z;

        /* renamed from: a, reason: collision with root package name */
        public int f17655a;

        /* renamed from: a0, reason: collision with root package name */
        public boolean f17656a0;

        /* renamed from: b, reason: collision with root package name */
        public int f17657b;

        /* renamed from: b0, reason: collision with root package name */
        public boolean f17658b0;

        /* renamed from: c, reason: collision with root package name */
        public float f17659c;

        /* renamed from: c0, reason: collision with root package name */
        public boolean f17660c0;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f17661d;

        /* renamed from: d0, reason: collision with root package name */
        public boolean f17662d0;

        /* renamed from: e, reason: collision with root package name */
        public int f17663e;

        /* renamed from: e0, reason: collision with root package name */
        public boolean f17664e0;

        /* renamed from: f, reason: collision with root package name */
        public int f17665f;

        /* renamed from: f0, reason: collision with root package name */
        public boolean f17666f0;

        /* renamed from: g, reason: collision with root package name */
        public int f17667g;

        /* renamed from: g0, reason: collision with root package name */
        public int f17668g0;

        /* renamed from: h, reason: collision with root package name */
        public int f17669h;

        /* renamed from: h0, reason: collision with root package name */
        public int f17670h0;

        /* renamed from: i, reason: collision with root package name */
        public int f17671i;

        /* renamed from: i0, reason: collision with root package name */
        public int f17672i0;

        /* renamed from: j, reason: collision with root package name */
        public int f17673j;

        /* renamed from: j0, reason: collision with root package name */
        public int f17674j0;

        /* renamed from: k, reason: collision with root package name */
        public int f17675k;

        /* renamed from: k0, reason: collision with root package name */
        public int f17676k0;

        /* renamed from: l, reason: collision with root package name */
        public int f17677l;

        /* renamed from: l0, reason: collision with root package name */
        public int f17678l0;

        /* renamed from: m, reason: collision with root package name */
        public int f17679m;

        /* renamed from: m0, reason: collision with root package name */
        public float f17680m0;

        /* renamed from: n, reason: collision with root package name */
        public int f17681n;

        /* renamed from: n0, reason: collision with root package name */
        public int f17682n0;

        /* renamed from: o, reason: collision with root package name */
        public int f17683o;

        /* renamed from: o0, reason: collision with root package name */
        public int f17684o0;

        /* renamed from: p, reason: collision with root package name */
        public int f17685p;

        /* renamed from: p0, reason: collision with root package name */
        public float f17686p0;

        /* renamed from: q, reason: collision with root package name */
        public int f17687q;

        /* renamed from: q0, reason: collision with root package name */
        public u4.h f17688q0;

        /* renamed from: r, reason: collision with root package name */
        public float f17689r;

        /* renamed from: s, reason: collision with root package name */
        public int f17690s;

        /* renamed from: t, reason: collision with root package name */
        public int f17691t;

        /* renamed from: u, reason: collision with root package name */
        public int f17692u;

        /* renamed from: v, reason: collision with root package name */
        public int f17693v;

        /* renamed from: w, reason: collision with root package name */
        public final int f17694w;

        /* renamed from: x, reason: collision with root package name */
        public int f17695x;

        /* renamed from: y, reason: collision with root package name */
        public final int f17696y;

        /* renamed from: z, reason: collision with root package name */
        public int f17697z;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f17655a = -1;
            this.f17657b = -1;
            this.f17659c = -1.0f;
            this.f17661d = true;
            this.f17663e = -1;
            this.f17665f = -1;
            this.f17667g = -1;
            this.f17669h = -1;
            this.f17671i = -1;
            this.f17673j = -1;
            this.f17675k = -1;
            this.f17677l = -1;
            this.f17679m = -1;
            this.f17681n = -1;
            this.f17683o = -1;
            this.f17685p = -1;
            this.f17687q = 0;
            this.f17689r = 0.0f;
            this.f17690s = -1;
            this.f17691t = -1;
            this.f17692u = -1;
            this.f17693v = -1;
            this.f17694w = Integer.MIN_VALUE;
            this.f17695x = Integer.MIN_VALUE;
            this.f17696y = Integer.MIN_VALUE;
            this.f17697z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.f17654J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f17656a0 = true;
            this.f17658b0 = true;
            this.f17660c0 = false;
            this.f17662d0 = false;
            this.f17664e0 = false;
            this.f17666f0 = false;
            this.f17668g0 = -1;
            this.f17670h0 = -1;
            this.f17672i0 = -1;
            this.f17674j0 = -1;
            this.f17676k0 = Integer.MIN_VALUE;
            this.f17678l0 = Integer.MIN_VALUE;
            this.f17680m0 = 0.5f;
            this.f17688q0 = new u4.h();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = obtainStyledAttributes.getIndex(i13);
                int i14 = e.f17727a.get(index);
                switch (i14) {
                    case 1:
                        this.V = obtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f17685p);
                        this.f17685p = resourceId;
                        if (resourceId == -1) {
                            this.f17685p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f17687q = obtainStyledAttributes.getDimensionPixelSize(index, this.f17687q);
                        break;
                    case 4:
                        float f13 = obtainStyledAttributes.getFloat(index, this.f17689r) % 360.0f;
                        this.f17689r = f13;
                        if (f13 < 0.0f) {
                            this.f17689r = (360.0f - f13) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f17655a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f17655a);
                        break;
                    case 6:
                        this.f17657b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f17657b);
                        break;
                    case 7:
                        this.f17659c = obtainStyledAttributes.getFloat(index, this.f17659c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f17663e);
                        this.f17663e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f17663e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f17665f);
                        this.f17665f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f17665f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f17667g);
                        this.f17667g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f17667g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f17669h);
                        this.f17669h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f17669h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f17671i);
                        this.f17671i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f17671i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f17673j);
                        this.f17673j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f17673j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f17675k);
                        this.f17675k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f17675k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f17677l);
                        this.f17677l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f17677l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f17679m);
                        this.f17679m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f17679m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f17690s);
                        this.f17690s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f17690s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f17691t);
                        this.f17691t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f17691t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f17692u);
                        this.f17692u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f17692u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f17693v);
                        this.f17693v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f17693v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f17694w = obtainStyledAttributes.getDimensionPixelSize(index, this.f17694w);
                        break;
                    case 22:
                        this.f17695x = obtainStyledAttributes.getDimensionPixelSize(index, this.f17695x);
                        break;
                    case 23:
                        this.f17696y = obtainStyledAttributes.getDimensionPixelSize(index, this.f17696y);
                        break;
                    case 24:
                        this.f17697z = obtainStyledAttributes.getDimensionPixelSize(index, this.f17697z);
                        break;
                    case 25:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.W = obtainStyledAttributes.getBoolean(index, this.W);
                        break;
                    case 28:
                        this.X = obtainStyledAttributes.getBoolean(index, this.X);
                        break;
                    case 29:
                        this.E = obtainStyledAttributes.getFloat(index, this.E);
                        break;
                    case 30:
                        this.F = obtainStyledAttributes.getFloat(index, this.F);
                        break;
                    case 31:
                        int i15 = obtainStyledAttributes.getInt(index, 0);
                        this.L = i15;
                        if (i15 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i16 = obtainStyledAttributes.getInt(index, 0);
                        this.M = i16;
                        if (i16 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.P) == -2) {
                                this.P = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.R));
                        this.L = 2;
                        break;
                    case 36:
                        try {
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.O) == -2) {
                                this.O = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.Q) == -2) {
                                this.Q = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.S));
                        this.M = 2;
                        break;
                    default:
                        switch (i14) {
                            case 44:
                                p.C(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.H = obtainStyledAttributes.getFloat(index, this.H);
                                break;
                            case 46:
                                this.I = obtainStyledAttributes.getFloat(index, this.I);
                                break;
                            case 47:
                                this.f17654J = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.K = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.T = obtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                                break;
                            case 50:
                                this.U = obtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                                break;
                            case 51:
                                this.Y = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f17681n);
                                this.f17681n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f17681n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f17683o);
                                this.f17683o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f17683o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i14) {
                                    case 64:
                                        p.B(this, obtainStyledAttributes, index, 0);
                                        break;
                                    case 65:
                                        p.B(this, obtainStyledAttributes, index, 1);
                                        break;
                                    case 66:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 67:
                                        this.f17661d = obtainStyledAttributes.getBoolean(index, this.f17661d);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public final void a() {
            this.f17662d0 = false;
            this.f17656a0 = true;
            this.f17658b0 = true;
            int i13 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i13 == -2 && this.W) {
                this.f17656a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            int i14 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i14 == -2 && this.X) {
                this.f17658b0 = false;
                if (this.M == 0) {
                    this.M = 1;
                }
            }
            if (i13 == 0 || i13 == -1) {
                this.f17656a0 = false;
                if (i13 == 0 && this.L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.W = true;
                }
            }
            if (i14 == 0 || i14 == -1) {
                this.f17658b0 = false;
                if (i14 == 0 && this.M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.X = true;
                }
            }
            if (this.f17659c == -1.0f && this.f17655a == -1 && this.f17657b == -1) {
                return;
            }
            this.f17662d0 = true;
            this.f17656a0 = true;
            this.f17658b0 = true;
            if (!(this.f17688q0 instanceof u4.m)) {
                this.f17688q0 = new u4.m();
            }
            ((u4.m) this.f17688q0).n0(this.V);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 259
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }

        public LayoutParams(int i13, int i14) {
            super(i13, i14);
            this.f17655a = -1;
            this.f17657b = -1;
            this.f17659c = -1.0f;
            this.f17661d = true;
            this.f17663e = -1;
            this.f17665f = -1;
            this.f17667g = -1;
            this.f17669h = -1;
            this.f17671i = -1;
            this.f17673j = -1;
            this.f17675k = -1;
            this.f17677l = -1;
            this.f17679m = -1;
            this.f17681n = -1;
            this.f17683o = -1;
            this.f17685p = -1;
            this.f17687q = 0;
            this.f17689r = 0.0f;
            this.f17690s = -1;
            this.f17691t = -1;
            this.f17692u = -1;
            this.f17693v = -1;
            this.f17694w = Integer.MIN_VALUE;
            this.f17695x = Integer.MIN_VALUE;
            this.f17696y = Integer.MIN_VALUE;
            this.f17697z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.f17654J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f17656a0 = true;
            this.f17658b0 = true;
            this.f17660c0 = false;
            this.f17662d0 = false;
            this.f17664e0 = false;
            this.f17666f0 = false;
            this.f17668g0 = -1;
            this.f17670h0 = -1;
            this.f17672i0 = -1;
            this.f17674j0 = -1;
            this.f17676k0 = Integer.MIN_VALUE;
            this.f17678l0 = Integer.MIN_VALUE;
            this.f17680m0 = 0.5f;
            this.f17688q0 = new u4.h();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f17655a = -1;
            this.f17657b = -1;
            this.f17659c = -1.0f;
            this.f17661d = true;
            this.f17663e = -1;
            this.f17665f = -1;
            this.f17667g = -1;
            this.f17669h = -1;
            this.f17671i = -1;
            this.f17673j = -1;
            this.f17675k = -1;
            this.f17677l = -1;
            this.f17679m = -1;
            this.f17681n = -1;
            this.f17683o = -1;
            this.f17685p = -1;
            this.f17687q = 0;
            this.f17689r = 0.0f;
            this.f17690s = -1;
            this.f17691t = -1;
            this.f17692u = -1;
            this.f17693v = -1;
            this.f17694w = Integer.MIN_VALUE;
            this.f17695x = Integer.MIN_VALUE;
            this.f17696y = Integer.MIN_VALUE;
            this.f17697z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.f17654J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f17656a0 = true;
            this.f17658b0 = true;
            this.f17660c0 = false;
            this.f17662d0 = false;
            this.f17664e0 = false;
            this.f17666f0 = false;
            this.f17668g0 = -1;
            this.f17670h0 = -1;
            this.f17672i0 = -1;
            this.f17674j0 = -1;
            this.f17676k0 = Integer.MIN_VALUE;
            this.f17678l0 = Integer.MIN_VALUE;
            this.f17680m0 = 0.5f;
            this.f17688q0 = new u4.h();
        }
    }
}
