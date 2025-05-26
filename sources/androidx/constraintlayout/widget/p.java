package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.AdError;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kh2.n3;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f17849g = {0, 4, 8};

    /* renamed from: h, reason: collision with root package name */
    public static final SparseIntArray f17850h;

    /* renamed from: i, reason: collision with root package name */
    public static final SparseIntArray f17851i;

    /* renamed from: a, reason: collision with root package name */
    public String f17852a;

    /* renamed from: b, reason: collision with root package name */
    public String f17853b = "";

    /* renamed from: c, reason: collision with root package name */
    public int f17854c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f17855d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public boolean f17856e = true;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f17857f = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f17850h = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f17851i = sparseIntArray2;
        sparseIntArray.append(s.Constraint_layout_constraintLeft_toLeftOf, 25);
        sparseIntArray.append(s.Constraint_layout_constraintLeft_toRightOf, 26);
        sparseIntArray.append(s.Constraint_layout_constraintRight_toLeftOf, 29);
        sparseIntArray.append(s.Constraint_layout_constraintRight_toRightOf, 30);
        sparseIntArray.append(s.Constraint_layout_constraintTop_toTopOf, 36);
        sparseIntArray.append(s.Constraint_layout_constraintTop_toBottomOf, 35);
        sparseIntArray.append(s.Constraint_layout_constraintBottom_toTopOf, 4);
        sparseIntArray.append(s.Constraint_layout_constraintBottom_toBottomOf, 3);
        sparseIntArray.append(s.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        sparseIntArray.append(s.Constraint_layout_constraintBaseline_toTopOf, 91);
        sparseIntArray.append(s.Constraint_layout_constraintBaseline_toBottomOf, 92);
        sparseIntArray.append(s.Constraint_layout_editor_absoluteX, 6);
        sparseIntArray.append(s.Constraint_layout_editor_absoluteY, 7);
        sparseIntArray.append(s.Constraint_layout_constraintGuide_begin, 17);
        sparseIntArray.append(s.Constraint_layout_constraintGuide_end, 18);
        sparseIntArray.append(s.Constraint_layout_constraintGuide_percent, 19);
        sparseIntArray.append(s.Constraint_guidelineUseRtl, 99);
        sparseIntArray.append(s.Constraint_android_orientation, 27);
        sparseIntArray.append(s.Constraint_layout_constraintStart_toEndOf, 32);
        sparseIntArray.append(s.Constraint_layout_constraintStart_toStartOf, 33);
        sparseIntArray.append(s.Constraint_layout_constraintEnd_toStartOf, 10);
        sparseIntArray.append(s.Constraint_layout_constraintEnd_toEndOf, 9);
        sparseIntArray.append(s.Constraint_layout_goneMarginLeft, 13);
        sparseIntArray.append(s.Constraint_layout_goneMarginTop, 16);
        sparseIntArray.append(s.Constraint_layout_goneMarginRight, 14);
        sparseIntArray.append(s.Constraint_layout_goneMarginBottom, 11);
        sparseIntArray.append(s.Constraint_layout_goneMarginStart, 15);
        sparseIntArray.append(s.Constraint_layout_goneMarginEnd, 12);
        sparseIntArray.append(s.Constraint_layout_constraintVertical_weight, 40);
        sparseIntArray.append(s.Constraint_layout_constraintHorizontal_weight, 39);
        sparseIntArray.append(s.Constraint_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray.append(s.Constraint_layout_constraintVertical_chainStyle, 42);
        sparseIntArray.append(s.Constraint_layout_constraintHorizontal_bias, 20);
        sparseIntArray.append(s.Constraint_layout_constraintVertical_bias, 37);
        sparseIntArray.append(s.Constraint_layout_constraintDimensionRatio, 5);
        sparseIntArray.append(s.Constraint_layout_constraintLeft_creator, 87);
        sparseIntArray.append(s.Constraint_layout_constraintTop_creator, 87);
        sparseIntArray.append(s.Constraint_layout_constraintRight_creator, 87);
        sparseIntArray.append(s.Constraint_layout_constraintBottom_creator, 87);
        sparseIntArray.append(s.Constraint_layout_constraintBaseline_creator, 87);
        sparseIntArray.append(s.Constraint_android_layout_marginLeft, 24);
        sparseIntArray.append(s.Constraint_android_layout_marginRight, 28);
        sparseIntArray.append(s.Constraint_android_layout_marginStart, 31);
        sparseIntArray.append(s.Constraint_android_layout_marginEnd, 8);
        sparseIntArray.append(s.Constraint_android_layout_marginTop, 34);
        sparseIntArray.append(s.Constraint_android_layout_marginBottom, 2);
        sparseIntArray.append(s.Constraint_android_layout_width, 23);
        sparseIntArray.append(s.Constraint_android_layout_height, 21);
        sparseIntArray.append(s.Constraint_layout_constraintWidth, 95);
        sparseIntArray.append(s.Constraint_layout_constraintHeight, 96);
        sparseIntArray.append(s.Constraint_android_visibility, 22);
        sparseIntArray.append(s.Constraint_android_alpha, 43);
        sparseIntArray.append(s.Constraint_android_elevation, 44);
        sparseIntArray.append(s.Constraint_android_rotationX, 45);
        sparseIntArray.append(s.Constraint_android_rotationY, 46);
        sparseIntArray.append(s.Constraint_android_rotation, 60);
        sparseIntArray.append(s.Constraint_android_scaleX, 47);
        sparseIntArray.append(s.Constraint_android_scaleY, 48);
        sparseIntArray.append(s.Constraint_android_transformPivotX, 49);
        sparseIntArray.append(s.Constraint_android_transformPivotY, 50);
        sparseIntArray.append(s.Constraint_android_translationX, 51);
        sparseIntArray.append(s.Constraint_android_translationY, 52);
        sparseIntArray.append(s.Constraint_android_translationZ, 53);
        sparseIntArray.append(s.Constraint_layout_constraintWidth_default, 54);
        sparseIntArray.append(s.Constraint_layout_constraintHeight_default, 55);
        sparseIntArray.append(s.Constraint_layout_constraintWidth_max, 56);
        sparseIntArray.append(s.Constraint_layout_constraintHeight_max, 57);
        sparseIntArray.append(s.Constraint_layout_constraintWidth_min, 58);
        sparseIntArray.append(s.Constraint_layout_constraintHeight_min, 59);
        sparseIntArray.append(s.Constraint_layout_constraintCircle, 61);
        sparseIntArray.append(s.Constraint_layout_constraintCircleRadius, 62);
        sparseIntArray.append(s.Constraint_layout_constraintCircleAngle, 63);
        sparseIntArray.append(s.Constraint_animateRelativeTo, 64);
        sparseIntArray.append(s.Constraint_transitionEasing, 65);
        sparseIntArray.append(s.Constraint_drawPath, 66);
        sparseIntArray.append(s.Constraint_transitionPathRotate, 67);
        sparseIntArray.append(s.Constraint_motionStagger, 79);
        sparseIntArray.append(s.Constraint_android_id, 38);
        sparseIntArray.append(s.Constraint_motionProgress, 68);
        sparseIntArray.append(s.Constraint_layout_constraintWidth_percent, 69);
        sparseIntArray.append(s.Constraint_layout_constraintHeight_percent, 70);
        sparseIntArray.append(s.Constraint_layout_wrapBehaviorInParent, 97);
        sparseIntArray.append(s.Constraint_chainUseRtl, 71);
        sparseIntArray.append(s.Constraint_barrierDirection, 72);
        sparseIntArray.append(s.Constraint_barrierMargin, 73);
        sparseIntArray.append(s.Constraint_constraint_referenced_ids, 74);
        sparseIntArray.append(s.Constraint_barrierAllowsGoneWidgets, 75);
        sparseIntArray.append(s.Constraint_pathMotionArc, 76);
        sparseIntArray.append(s.Constraint_layout_constraintTag, 77);
        sparseIntArray.append(s.Constraint_visibilityMode, 78);
        sparseIntArray.append(s.Constraint_layout_constrainedWidth, 80);
        sparseIntArray.append(s.Constraint_layout_constrainedHeight, 81);
        sparseIntArray.append(s.Constraint_polarRelativeTo, 82);
        sparseIntArray.append(s.Constraint_transformPivotTarget, 83);
        sparseIntArray.append(s.Constraint_quantizeMotionSteps, 84);
        sparseIntArray.append(s.Constraint_quantizeMotionPhase, 85);
        sparseIntArray.append(s.Constraint_quantizeMotionInterpolator, 86);
        sparseIntArray2.append(s.ConstraintOverride_layout_editor_absoluteY, 6);
        sparseIntArray2.append(s.ConstraintOverride_layout_editor_absoluteY, 7);
        sparseIntArray2.append(s.ConstraintOverride_android_orientation, 27);
        sparseIntArray2.append(s.ConstraintOverride_layout_goneMarginLeft, 13);
        sparseIntArray2.append(s.ConstraintOverride_layout_goneMarginTop, 16);
        sparseIntArray2.append(s.ConstraintOverride_layout_goneMarginRight, 14);
        sparseIntArray2.append(s.ConstraintOverride_layout_goneMarginBottom, 11);
        sparseIntArray2.append(s.ConstraintOverride_layout_goneMarginStart, 15);
        sparseIntArray2.append(s.ConstraintOverride_layout_goneMarginEnd, 12);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintVertical_weight, 40);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintVertical_bias, 37);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintDimensionRatio, 5);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintLeft_creator, 87);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintTop_creator, 87);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintRight_creator, 87);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintBottom_creator, 87);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintBaseline_creator, 87);
        sparseIntArray2.append(s.ConstraintOverride_android_layout_marginLeft, 24);
        sparseIntArray2.append(s.ConstraintOverride_android_layout_marginRight, 28);
        sparseIntArray2.append(s.ConstraintOverride_android_layout_marginStart, 31);
        sparseIntArray2.append(s.ConstraintOverride_android_layout_marginEnd, 8);
        sparseIntArray2.append(s.ConstraintOverride_android_layout_marginTop, 34);
        sparseIntArray2.append(s.ConstraintOverride_android_layout_marginBottom, 2);
        sparseIntArray2.append(s.ConstraintOverride_android_layout_width, 23);
        sparseIntArray2.append(s.ConstraintOverride_android_layout_height, 21);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintWidth, 95);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintHeight, 96);
        sparseIntArray2.append(s.ConstraintOverride_android_visibility, 22);
        sparseIntArray2.append(s.ConstraintOverride_android_alpha, 43);
        sparseIntArray2.append(s.ConstraintOverride_android_elevation, 44);
        sparseIntArray2.append(s.ConstraintOverride_android_rotationX, 45);
        sparseIntArray2.append(s.ConstraintOverride_android_rotationY, 46);
        sparseIntArray2.append(s.ConstraintOverride_android_rotation, 60);
        sparseIntArray2.append(s.ConstraintOverride_android_scaleX, 47);
        sparseIntArray2.append(s.ConstraintOverride_android_scaleY, 48);
        sparseIntArray2.append(s.ConstraintOverride_android_transformPivotX, 49);
        sparseIntArray2.append(s.ConstraintOverride_android_transformPivotY, 50);
        sparseIntArray2.append(s.ConstraintOverride_android_translationX, 51);
        sparseIntArray2.append(s.ConstraintOverride_android_translationY, 52);
        sparseIntArray2.append(s.ConstraintOverride_android_translationZ, 53);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintWidth_default, 54);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintHeight_default, 55);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintWidth_max, 56);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintHeight_max, 57);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintWidth_min, 58);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintHeight_min, 59);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintCircleRadius, 62);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintCircleAngle, 63);
        sparseIntArray2.append(s.ConstraintOverride_animateRelativeTo, 64);
        sparseIntArray2.append(s.ConstraintOverride_transitionEasing, 65);
        sparseIntArray2.append(s.ConstraintOverride_drawPath, 66);
        sparseIntArray2.append(s.ConstraintOverride_transitionPathRotate, 67);
        sparseIntArray2.append(s.ConstraintOverride_motionStagger, 79);
        sparseIntArray2.append(s.ConstraintOverride_android_id, 38);
        sparseIntArray2.append(s.ConstraintOverride_motionTarget, 98);
        sparseIntArray2.append(s.ConstraintOverride_motionProgress, 68);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintWidth_percent, 69);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintHeight_percent, 70);
        sparseIntArray2.append(s.ConstraintOverride_chainUseRtl, 71);
        sparseIntArray2.append(s.ConstraintOverride_barrierDirection, 72);
        sparseIntArray2.append(s.ConstraintOverride_barrierMargin, 73);
        sparseIntArray2.append(s.ConstraintOverride_constraint_referenced_ids, 74);
        sparseIntArray2.append(s.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        sparseIntArray2.append(s.ConstraintOverride_pathMotionArc, 76);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintTag, 77);
        sparseIntArray2.append(s.ConstraintOverride_visibilityMode, 78);
        sparseIntArray2.append(s.ConstraintOverride_layout_constrainedWidth, 80);
        sparseIntArray2.append(s.ConstraintOverride_layout_constrainedHeight, 81);
        sparseIntArray2.append(s.ConstraintOverride_polarRelativeTo, 82);
        sparseIntArray2.append(s.ConstraintOverride_transformPivotTarget, 83);
        sparseIntArray2.append(s.ConstraintOverride_quantizeMotionSteps, 84);
        sparseIntArray2.append(s.ConstraintOverride_quantizeMotionPhase, 85);
        sparseIntArray2.append(s.ConstraintOverride_quantizeMotionInterpolator, 86);
        sparseIntArray2.append(s.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    public static int A(TypedArray typedArray, int i13, int i14) {
        int resourceId = typedArray.getResourceId(i13, i14);
        return resourceId == -1 ? typedArray.getInt(i13, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void B(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.p.B(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void C(ConstraintLayout.LayoutParams layoutParams, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i13 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                i13 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
                r2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(r2);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(r2, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i13 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        layoutParams.G = str;
    }

    public static void D(k kVar, TypedArray typedArray) {
        boolean z13;
        int indexCount = typedArray.getIndexCount();
        j jVar = new j();
        kVar.f17770h = jVar;
        m mVar = kVar.f17766d;
        mVar.f17816a = false;
        l lVar = kVar.f17767e;
        lVar.f17775b = false;
        n nVar = kVar.f17765c;
        nVar.f17829a = false;
        o oVar = kVar.f17768f;
        oVar.f17835a = false;
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = typedArray.getIndex(i13);
            int i14 = f17851i.get(index);
            SparseIntArray sparseIntArray = f17850h;
            switch (i14) {
                case 2:
                    z13 = false;
                    jVar.b(2, typedArray.getDimensionPixelSize(index, lVar.f17772J));
                    continue;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                case 5:
                    z13 = false;
                    jVar.c(5, typedArray.getString(index));
                    continue;
                case 6:
                    z13 = false;
                    jVar.b(6, typedArray.getDimensionPixelOffset(index, lVar.D));
                    continue;
                case 7:
                    z13 = false;
                    jVar.b(7, typedArray.getDimensionPixelOffset(index, lVar.E));
                    continue;
                case 8:
                    z13 = false;
                    jVar.b(8, typedArray.getDimensionPixelSize(index, lVar.K));
                    continue;
                case 11:
                    z13 = false;
                    jVar.b(11, typedArray.getDimensionPixelSize(index, lVar.Q));
                    continue;
                case 12:
                    z13 = false;
                    jVar.b(12, typedArray.getDimensionPixelSize(index, lVar.R));
                    continue;
                case 13:
                    z13 = false;
                    jVar.b(13, typedArray.getDimensionPixelSize(index, lVar.N));
                    continue;
                case 14:
                    z13 = false;
                    jVar.b(14, typedArray.getDimensionPixelSize(index, lVar.P));
                    continue;
                case 15:
                    z13 = false;
                    jVar.b(15, typedArray.getDimensionPixelSize(index, lVar.S));
                    continue;
                case 16:
                    z13 = false;
                    jVar.b(16, typedArray.getDimensionPixelSize(index, lVar.O));
                    continue;
                case 17:
                    z13 = false;
                    jVar.b(17, typedArray.getDimensionPixelOffset(index, lVar.f17781e));
                    continue;
                case 18:
                    z13 = false;
                    jVar.b(18, typedArray.getDimensionPixelOffset(index, lVar.f17783f));
                    continue;
                case 19:
                    z13 = false;
                    jVar.a(19, typedArray.getFloat(index, lVar.f17785g));
                    continue;
                case 20:
                    z13 = false;
                    jVar.a(20, typedArray.getFloat(index, lVar.f17812x));
                    continue;
                case 21:
                    z13 = false;
                    jVar.b(21, typedArray.getLayoutDimension(index, lVar.f17779d));
                    continue;
                case 22:
                    z13 = false;
                    jVar.b(22, f17849g[typedArray.getInt(index, nVar.f17830b)]);
                    continue;
                case 23:
                    z13 = false;
                    jVar.b(23, typedArray.getLayoutDimension(index, lVar.f17777c));
                    continue;
                case 24:
                    z13 = false;
                    jVar.b(24, typedArray.getDimensionPixelSize(index, lVar.G));
                    continue;
                case 27:
                    z13 = false;
                    jVar.b(27, typedArray.getInt(index, lVar.F));
                    continue;
                case 28:
                    z13 = false;
                    jVar.b(28, typedArray.getDimensionPixelSize(index, lVar.H));
                    continue;
                case 31:
                    z13 = false;
                    jVar.b(31, typedArray.getDimensionPixelSize(index, lVar.L));
                    continue;
                case 34:
                    z13 = false;
                    jVar.b(34, typedArray.getDimensionPixelSize(index, lVar.I));
                    continue;
                case 37:
                    z13 = false;
                    jVar.a(37, typedArray.getFloat(index, lVar.f17813y));
                    continue;
                case 38:
                    z13 = false;
                    int resourceId = typedArray.getResourceId(index, kVar.f17763a);
                    kVar.f17763a = resourceId;
                    jVar.b(38, resourceId);
                    continue;
                case 39:
                    z13 = false;
                    jVar.a(39, typedArray.getFloat(index, lVar.V));
                    continue;
                case 40:
                    z13 = false;
                    jVar.a(40, typedArray.getFloat(index, lVar.U));
                    continue;
                case 41:
                    z13 = false;
                    jVar.b(41, typedArray.getInt(index, lVar.W));
                    continue;
                case 42:
                    z13 = false;
                    jVar.b(42, typedArray.getInt(index, lVar.X));
                    continue;
                case 43:
                    z13 = false;
                    jVar.a(43, typedArray.getFloat(index, nVar.f17832d));
                    continue;
                case 44:
                    z13 = false;
                    jVar.d(44, true);
                    jVar.a(44, typedArray.getDimension(index, oVar.f17848n));
                    continue;
                case 45:
                    z13 = false;
                    jVar.a(45, typedArray.getFloat(index, oVar.f17837c));
                    continue;
                case 46:
                    z13 = false;
                    jVar.a(46, typedArray.getFloat(index, oVar.f17838d));
                    continue;
                case 47:
                    z13 = false;
                    jVar.a(47, typedArray.getFloat(index, oVar.f17839e));
                    continue;
                case 48:
                    z13 = false;
                    jVar.a(48, typedArray.getFloat(index, oVar.f17840f));
                    continue;
                case 49:
                    z13 = false;
                    jVar.a(49, typedArray.getDimension(index, oVar.f17841g));
                    continue;
                case 50:
                    z13 = false;
                    jVar.a(50, typedArray.getDimension(index, oVar.f17842h));
                    continue;
                case 51:
                    z13 = false;
                    jVar.a(51, typedArray.getDimension(index, oVar.f17844j));
                    continue;
                case 52:
                    z13 = false;
                    jVar.a(52, typedArray.getDimension(index, oVar.f17845k));
                    continue;
                case 53:
                    z13 = false;
                    jVar.a(53, typedArray.getDimension(index, oVar.f17846l));
                    continue;
                case 54:
                    z13 = false;
                    jVar.b(54, typedArray.getInt(index, lVar.Y));
                    continue;
                case 55:
                    z13 = false;
                    jVar.b(55, typedArray.getInt(index, lVar.Z));
                    continue;
                case 56:
                    z13 = false;
                    jVar.b(56, typedArray.getDimensionPixelSize(index, lVar.f17774a0));
                    continue;
                case 57:
                    z13 = false;
                    jVar.b(57, typedArray.getDimensionPixelSize(index, lVar.f17776b0));
                    continue;
                case 58:
                    z13 = false;
                    jVar.b(58, typedArray.getDimensionPixelSize(index, lVar.f17778c0));
                    continue;
                case 59:
                    z13 = false;
                    jVar.b(59, typedArray.getDimensionPixelSize(index, lVar.f17780d0));
                    continue;
                case 60:
                    z13 = false;
                    jVar.a(60, typedArray.getFloat(index, oVar.f17836b));
                    continue;
                case 62:
                    z13 = false;
                    jVar.b(62, typedArray.getDimensionPixelSize(index, lVar.B));
                    continue;
                case 63:
                    z13 = false;
                    jVar.a(63, typedArray.getFloat(index, lVar.C));
                    continue;
                case 64:
                    z13 = false;
                    jVar.b(64, A(typedArray, index, mVar.f17817b));
                    continue;
                case 65:
                    z13 = false;
                    if (typedArray.peekValue(index).type != 3) {
                        jVar.c(65, t4.e.f116352c[typedArray.getInteger(index, 0)]);
                        break;
                    } else {
                        jVar.c(65, typedArray.getString(index));
                        continue;
                    }
                case 66:
                    z13 = false;
                    jVar.b(66, typedArray.getInt(index, 0));
                    continue;
                case 67:
                    jVar.a(67, typedArray.getFloat(index, mVar.f17823h));
                    break;
                case 68:
                    jVar.a(68, typedArray.getFloat(index, nVar.f17833e));
                    break;
                case 69:
                    jVar.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    jVar.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    jVar.b(72, typedArray.getInt(index, lVar.f17786g0));
                    break;
                case 73:
                    jVar.b(73, typedArray.getDimensionPixelSize(index, lVar.f17788h0));
                    break;
                case 74:
                    jVar.c(74, typedArray.getString(index));
                    break;
                case 75:
                    jVar.d(75, typedArray.getBoolean(index, lVar.f17802o0));
                    break;
                case 76:
                    jVar.b(76, typedArray.getInt(index, mVar.f17820e));
                    break;
                case 77:
                    jVar.c(77, typedArray.getString(index));
                    break;
                case 78:
                    jVar.b(78, typedArray.getInt(index, nVar.f17831c));
                    break;
                case 79:
                    jVar.a(79, typedArray.getFloat(index, mVar.f17822g));
                    break;
                case 80:
                    jVar.d(80, typedArray.getBoolean(index, lVar.f17798m0));
                    break;
                case 81:
                    jVar.d(81, typedArray.getBoolean(index, lVar.f17800n0));
                    break;
                case 82:
                    jVar.b(82, typedArray.getInteger(index, mVar.f17818c));
                    break;
                case 83:
                    jVar.b(83, A(typedArray, index, oVar.f17843i));
                    break;
                case 84:
                    jVar.b(84, typedArray.getInteger(index, mVar.f17825j));
                    break;
                case 85:
                    jVar.a(85, typedArray.getFloat(index, mVar.f17824i));
                    break;
                case 86:
                    int i15 = typedArray.peekValue(index).type;
                    if (i15 == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        mVar.f17828m = resourceId2;
                        jVar.b(89, resourceId2);
                        if (mVar.f17828m != -1) {
                            mVar.f17827l = -2;
                            jVar.b(88, -2);
                            break;
                        }
                    } else if (i15 == 3) {
                        String string = typedArray.getString(index);
                        mVar.f17826k = string;
                        jVar.c(90, string);
                        if (mVar.f17826k.indexOf("/") > 0) {
                            int resourceId3 = typedArray.getResourceId(index, -1);
                            mVar.f17828m = resourceId3;
                            jVar.b(89, resourceId3);
                            mVar.f17827l = -2;
                            jVar.b(88, -2);
                            break;
                        } else {
                            mVar.f17827l = -1;
                            jVar.b(88, -1);
                            break;
                        }
                    } else {
                        int integer = typedArray.getInteger(index, mVar.f17828m);
                        mVar.f17827l = integer;
                        jVar.b(88, integer);
                        break;
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                case 93:
                    jVar.b(93, typedArray.getDimensionPixelSize(index, lVar.M));
                    break;
                case 94:
                    jVar.b(94, typedArray.getDimensionPixelSize(index, lVar.T));
                    break;
                case 95:
                    B(jVar, typedArray, index, 0);
                    z13 = false;
                    continue;
                case 96:
                    B(jVar, typedArray, index, 1);
                    break;
                case 97:
                    jVar.b(97, typedArray.getInt(index, lVar.f17804p0));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_VIDEO_CREATOR_ANALYTICS_MODULE /* 98 */:
                    if (MotionLayout.f17523m0) {
                        int resourceId4 = typedArray.getResourceId(index, kVar.f17763a);
                        kVar.f17763a = resourceId4;
                        if (resourceId4 == -1) {
                            kVar.f17764b = typedArray.getString(index);
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        kVar.f17764b = typedArray.getString(index);
                        break;
                    } else {
                        kVar.f17763a = typedArray.getResourceId(index, kVar.f17763a);
                        break;
                    }
                    break;
                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NOTE_AND_FAVORITE_MODULE /* 99 */:
                    jVar.d(99, typedArray.getBoolean(index, lVar.f17787h));
                    break;
            }
            z13 = false;
        }
    }

    public static String L(int i13) {
        switch (i13) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return AdError.UNDEFINED_DOMAIN;
        }
    }

    public static k d(Context context, XmlResourceParser xmlResourceParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        k kVar = new k();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, s.ConstraintOverride);
        D(kVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return kVar;
    }

    public static int[] r(Barrier barrier, String str) {
        int i13;
        Object designInformation;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i14 = 0;
        int i15 = 0;
        while (i14 < split.length) {
            String trim = split[i14].trim();
            try {
                i13 = r.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i13 = 0;
            }
            if (i13 == 0) {
                i13 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i13 == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) barrier.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i13 = ((Integer) designInformation).intValue();
            }
            iArr[i15] = i13;
            i14++;
            i15++;
        }
        return i15 != split.length ? Arrays.copyOf(iArr, i15) : iArr;
    }

    public static k v(Context context, AttributeSet attributeSet, boolean z13) {
        k kVar = new k();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z13 ? s.ConstraintOverride : s.Constraint);
        if (z13) {
            D(kVar, obtainStyledAttributes);
        } else {
            int indexCount = obtainStyledAttributes.getIndexCount();
            int i13 = 0;
            while (true) {
                l lVar = kVar.f17767e;
                if (i13 < indexCount) {
                    int index = obtainStyledAttributes.getIndex(i13);
                    int i14 = s.Constraint_android_id;
                    n nVar = kVar.f17765c;
                    o oVar = kVar.f17768f;
                    m mVar = kVar.f17766d;
                    if (index != i14 && s.Constraint_android_layout_marginStart != index && s.Constraint_android_layout_marginEnd != index) {
                        mVar.f17816a = true;
                        lVar.f17775b = true;
                        nVar.f17829a = true;
                        oVar.f17835a = true;
                    }
                    SparseIntArray sparseIntArray = f17850h;
                    switch (sparseIntArray.get(index)) {
                        case 1:
                            lVar.f17805q = A(obtainStyledAttributes, index, lVar.f17805q);
                            break;
                        case 2:
                            lVar.f17772J = obtainStyledAttributes.getDimensionPixelSize(index, lVar.f17772J);
                            break;
                        case 3:
                            lVar.f17803p = A(obtainStyledAttributes, index, lVar.f17803p);
                            break;
                        case 4:
                            lVar.f17801o = A(obtainStyledAttributes, index, lVar.f17801o);
                            break;
                        case 5:
                            lVar.f17814z = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            lVar.D = obtainStyledAttributes.getDimensionPixelOffset(index, lVar.D);
                            break;
                        case 7:
                            lVar.E = obtainStyledAttributes.getDimensionPixelOffset(index, lVar.E);
                            break;
                        case 8:
                            lVar.K = obtainStyledAttributes.getDimensionPixelSize(index, lVar.K);
                            break;
                        case 9:
                            lVar.f17811w = A(obtainStyledAttributes, index, lVar.f17811w);
                            break;
                        case 10:
                            lVar.f17810v = A(obtainStyledAttributes, index, lVar.f17810v);
                            break;
                        case 11:
                            lVar.Q = obtainStyledAttributes.getDimensionPixelSize(index, lVar.Q);
                            break;
                        case 12:
                            lVar.R = obtainStyledAttributes.getDimensionPixelSize(index, lVar.R);
                            break;
                        case 13:
                            lVar.N = obtainStyledAttributes.getDimensionPixelSize(index, lVar.N);
                            break;
                        case 14:
                            lVar.P = obtainStyledAttributes.getDimensionPixelSize(index, lVar.P);
                            break;
                        case 15:
                            lVar.S = obtainStyledAttributes.getDimensionPixelSize(index, lVar.S);
                            break;
                        case 16:
                            lVar.O = obtainStyledAttributes.getDimensionPixelSize(index, lVar.O);
                            break;
                        case 17:
                            lVar.f17781e = obtainStyledAttributes.getDimensionPixelOffset(index, lVar.f17781e);
                            break;
                        case 18:
                            lVar.f17783f = obtainStyledAttributes.getDimensionPixelOffset(index, lVar.f17783f);
                            break;
                        case 19:
                            lVar.f17785g = obtainStyledAttributes.getFloat(index, lVar.f17785g);
                            break;
                        case 20:
                            lVar.f17812x = obtainStyledAttributes.getFloat(index, lVar.f17812x);
                            break;
                        case 21:
                            lVar.f17779d = obtainStyledAttributes.getLayoutDimension(index, lVar.f17779d);
                            break;
                        case 22:
                            nVar.f17830b = f17849g[obtainStyledAttributes.getInt(index, nVar.f17830b)];
                            break;
                        case 23:
                            lVar.f17777c = obtainStyledAttributes.getLayoutDimension(index, lVar.f17777c);
                            break;
                        case 24:
                            lVar.G = obtainStyledAttributes.getDimensionPixelSize(index, lVar.G);
                            break;
                        case 25:
                            lVar.f17789i = A(obtainStyledAttributes, index, lVar.f17789i);
                            break;
                        case 26:
                            lVar.f17791j = A(obtainStyledAttributes, index, lVar.f17791j);
                            break;
                        case 27:
                            lVar.F = obtainStyledAttributes.getInt(index, lVar.F);
                            break;
                        case 28:
                            lVar.H = obtainStyledAttributes.getDimensionPixelSize(index, lVar.H);
                            break;
                        case 29:
                            lVar.f17793k = A(obtainStyledAttributes, index, lVar.f17793k);
                            break;
                        case 30:
                            lVar.f17795l = A(obtainStyledAttributes, index, lVar.f17795l);
                            break;
                        case 31:
                            lVar.L = obtainStyledAttributes.getDimensionPixelSize(index, lVar.L);
                            break;
                        case 32:
                            lVar.f17808t = A(obtainStyledAttributes, index, lVar.f17808t);
                            break;
                        case 33:
                            lVar.f17809u = A(obtainStyledAttributes, index, lVar.f17809u);
                            break;
                        case 34:
                            lVar.I = obtainStyledAttributes.getDimensionPixelSize(index, lVar.I);
                            break;
                        case 35:
                            lVar.f17799n = A(obtainStyledAttributes, index, lVar.f17799n);
                            break;
                        case 36:
                            lVar.f17797m = A(obtainStyledAttributes, index, lVar.f17797m);
                            break;
                        case 37:
                            lVar.f17813y = obtainStyledAttributes.getFloat(index, lVar.f17813y);
                            break;
                        case 38:
                            kVar.f17763a = obtainStyledAttributes.getResourceId(index, kVar.f17763a);
                            break;
                        case 39:
                            lVar.V = obtainStyledAttributes.getFloat(index, lVar.V);
                            break;
                        case 40:
                            lVar.U = obtainStyledAttributes.getFloat(index, lVar.U);
                            break;
                        case 41:
                            lVar.W = obtainStyledAttributes.getInt(index, lVar.W);
                            break;
                        case 42:
                            lVar.X = obtainStyledAttributes.getInt(index, lVar.X);
                            break;
                        case 43:
                            nVar.f17832d = obtainStyledAttributes.getFloat(index, nVar.f17832d);
                            break;
                        case 44:
                            oVar.f17847m = true;
                            oVar.f17848n = obtainStyledAttributes.getDimension(index, oVar.f17848n);
                            break;
                        case 45:
                            oVar.f17837c = obtainStyledAttributes.getFloat(index, oVar.f17837c);
                            break;
                        case 46:
                            oVar.f17838d = obtainStyledAttributes.getFloat(index, oVar.f17838d);
                            break;
                        case 47:
                            oVar.f17839e = obtainStyledAttributes.getFloat(index, oVar.f17839e);
                            break;
                        case 48:
                            oVar.f17840f = obtainStyledAttributes.getFloat(index, oVar.f17840f);
                            break;
                        case 49:
                            oVar.f17841g = obtainStyledAttributes.getDimension(index, oVar.f17841g);
                            break;
                        case 50:
                            oVar.f17842h = obtainStyledAttributes.getDimension(index, oVar.f17842h);
                            break;
                        case 51:
                            oVar.f17844j = obtainStyledAttributes.getDimension(index, oVar.f17844j);
                            break;
                        case 52:
                            oVar.f17845k = obtainStyledAttributes.getDimension(index, oVar.f17845k);
                            break;
                        case 53:
                            oVar.f17846l = obtainStyledAttributes.getDimension(index, oVar.f17846l);
                            break;
                        case 54:
                            lVar.Y = obtainStyledAttributes.getInt(index, lVar.Y);
                            break;
                        case 55:
                            lVar.Z = obtainStyledAttributes.getInt(index, lVar.Z);
                            break;
                        case 56:
                            lVar.f17774a0 = obtainStyledAttributes.getDimensionPixelSize(index, lVar.f17774a0);
                            break;
                        case 57:
                            lVar.f17776b0 = obtainStyledAttributes.getDimensionPixelSize(index, lVar.f17776b0);
                            break;
                        case 58:
                            lVar.f17778c0 = obtainStyledAttributes.getDimensionPixelSize(index, lVar.f17778c0);
                            break;
                        case 59:
                            lVar.f17780d0 = obtainStyledAttributes.getDimensionPixelSize(index, lVar.f17780d0);
                            break;
                        case 60:
                            oVar.f17836b = obtainStyledAttributes.getFloat(index, oVar.f17836b);
                            break;
                        case 61:
                            lVar.A = A(obtainStyledAttributes, index, lVar.A);
                            break;
                        case 62:
                            lVar.B = obtainStyledAttributes.getDimensionPixelSize(index, lVar.B);
                            break;
                        case 63:
                            lVar.C = obtainStyledAttributes.getFloat(index, lVar.C);
                            break;
                        case 64:
                            mVar.f17817b = A(obtainStyledAttributes, index, mVar.f17817b);
                            break;
                        case 65:
                            if (obtainStyledAttributes.peekValue(index).type != 3) {
                                mVar.f17819d = t4.e.f116352c[obtainStyledAttributes.getInteger(index, 0)];
                                break;
                            } else {
                                mVar.f17819d = obtainStyledAttributes.getString(index);
                                break;
                            }
                        case 66:
                            mVar.f17821f = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 67:
                            mVar.f17823h = obtainStyledAttributes.getFloat(index, mVar.f17823h);
                            break;
                        case 68:
                            nVar.f17833e = obtainStyledAttributes.getFloat(index, nVar.f17833e);
                            break;
                        case 69:
                            lVar.f17782e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 70:
                            lVar.f17784f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 71:
                            Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                            break;
                        case 72:
                            lVar.f17786g0 = obtainStyledAttributes.getInt(index, lVar.f17786g0);
                            break;
                        case 73:
                            lVar.f17788h0 = obtainStyledAttributes.getDimensionPixelSize(index, lVar.f17788h0);
                            break;
                        case 74:
                            lVar.f17794k0 = obtainStyledAttributes.getString(index);
                            break;
                        case 75:
                            lVar.f17802o0 = obtainStyledAttributes.getBoolean(index, lVar.f17802o0);
                            break;
                        case 76:
                            mVar.f17820e = obtainStyledAttributes.getInt(index, mVar.f17820e);
                            break;
                        case 77:
                            lVar.f17796l0 = obtainStyledAttributes.getString(index);
                            break;
                        case 78:
                            nVar.f17831c = obtainStyledAttributes.getInt(index, nVar.f17831c);
                            break;
                        case 79:
                            mVar.f17822g = obtainStyledAttributes.getFloat(index, mVar.f17822g);
                            break;
                        case 80:
                            lVar.f17798m0 = obtainStyledAttributes.getBoolean(index, lVar.f17798m0);
                            break;
                        case 81:
                            lVar.f17800n0 = obtainStyledAttributes.getBoolean(index, lVar.f17800n0);
                            break;
                        case 82:
                            mVar.f17818c = obtainStyledAttributes.getInteger(index, mVar.f17818c);
                            break;
                        case 83:
                            oVar.f17843i = A(obtainStyledAttributes, index, oVar.f17843i);
                            break;
                        case 84:
                            mVar.f17825j = obtainStyledAttributes.getInteger(index, mVar.f17825j);
                            break;
                        case 85:
                            mVar.f17824i = obtainStyledAttributes.getFloat(index, mVar.f17824i);
                            break;
                        case 86:
                            int i15 = obtainStyledAttributes.peekValue(index).type;
                            if (i15 != 1) {
                                if (i15 != 3) {
                                    mVar.f17827l = obtainStyledAttributes.getInteger(index, mVar.f17828m);
                                    break;
                                } else {
                                    String string = obtainStyledAttributes.getString(index);
                                    mVar.f17826k = string;
                                    if (string.indexOf("/") <= 0) {
                                        mVar.f17827l = -1;
                                        break;
                                    } else {
                                        mVar.f17828m = obtainStyledAttributes.getResourceId(index, -1);
                                        mVar.f17827l = -2;
                                        break;
                                    }
                                }
                            } else {
                                int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                mVar.f17828m = resourceId;
                                if (resourceId == -1) {
                                    break;
                                } else {
                                    mVar.f17827l = -2;
                                    break;
                                }
                            }
                        case 87:
                            Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case 88:
                        case 89:
                        case 90:
                        default:
                            Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case 91:
                            lVar.f17806r = A(obtainStyledAttributes, index, lVar.f17806r);
                            break;
                        case 92:
                            lVar.f17807s = A(obtainStyledAttributes, index, lVar.f17807s);
                            break;
                        case 93:
                            lVar.M = obtainStyledAttributes.getDimensionPixelSize(index, lVar.M);
                            break;
                        case 94:
                            lVar.T = obtainStyledAttributes.getDimensionPixelSize(index, lVar.T);
                            break;
                        case 95:
                            B(lVar, obtainStyledAttributes, index, 0);
                            break;
                        case 96:
                            B(lVar, obtainStyledAttributes, index, 1);
                            break;
                        case 97:
                            lVar.f17804p0 = obtainStyledAttributes.getInt(index, lVar.f17804p0);
                            break;
                    }
                    i13++;
                } else if (lVar.f17794k0 != null) {
                    lVar.f17792j0 = null;
                }
            }
        }
        obtainStyledAttributes.recycle();
        return kVar;
    }

    public final void E(int i13, int i14, int i15) {
        k w13 = w(i13);
        switch (i14) {
            case 1:
                w13.f17767e.N = i15;
                return;
            case 2:
                w13.f17767e.P = i15;
                return;
            case 3:
                w13.f17767e.O = i15;
                return;
            case 4:
                w13.f17767e.Q = i15;
                return;
            case 5:
                w13.f17767e.T = i15;
                return;
            case 6:
                w13.f17767e.S = i15;
                return;
            case 7:
                w13.f17767e.R = i15;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public final void F(int i13, int i14) {
        w(i13).f17767e.f17781e = i14;
        w(i13).f17767e.f17783f = -1;
        w(i13).f17767e.f17785g = -1.0f;
    }

    public final void G(int i13, float f13) {
        w(i13).f17767e.f17785g = f13;
        w(i13).f17767e.f17783f = -1;
        w(i13).f17767e.f17781e = -1;
    }

    public final void H(int i13, float f13) {
        w(i13).f17767e.f17812x = f13;
    }

    public final void I(int i13, int i14, int i15) {
        k w13 = w(i13);
        switch (i14) {
            case 1:
                w13.f17767e.G = i15;
                return;
            case 2:
                w13.f17767e.H = i15;
                return;
            case 3:
                w13.f17767e.I = i15;
                return;
            case 4:
                w13.f17767e.f17772J = i15;
                return;
            case 5:
                w13.f17767e.M = i15;
                return;
            case 6:
                w13.f17767e.L = i15;
                return;
            case 7:
                w13.f17767e.K = i15;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public final void J(int i13, float f13) {
        w(i13).f17767e.f17813y = f13;
    }

    public final void K(int i13, int i14) {
        w(i13).f17765c.f17830b = i14;
    }

    public final void a(ConstraintLayout constraintLayout) {
        k kVar;
        int childCount = constraintLayout.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = constraintLayout.getChildAt(i13);
            int id3 = childAt.getId();
            HashMap hashMap = this.f17857f;
            if (!hashMap.containsKey(Integer.valueOf(id3))) {
                Log.w("ConstraintSet", "id unknown " + n3.x(childAt));
            } else {
                if (this.f17856e && id3 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (hashMap.containsKey(Integer.valueOf(id3)) && (kVar = (k) hashMap.get(Integer.valueOf(id3))) != null) {
                    c.f(childAt, kVar.f17769g);
                }
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = this.f17857f;
        HashSet hashSet = new HashSet(hashMap.keySet());
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = constraintLayout.getChildAt(i13);
            int id3 = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id3))) {
                Log.w("ConstraintSet", "id unknown " + n3.x(childAt));
            } else {
                if (this.f17856e && id3 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id3 != -1) {
                    if (hashMap.containsKey(Integer.valueOf(id3))) {
                        hashSet.remove(Integer.valueOf(id3));
                        k kVar = (k) hashMap.get(Integer.valueOf(id3));
                        if (kVar != null) {
                            if (childAt instanceof Barrier) {
                                l lVar = kVar.f17767e;
                                lVar.f17790i0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id3);
                                barrier.f17643i = lVar.f17786g0;
                                int i14 = lVar.f17788h0;
                                u4.a aVar = barrier.f17645k;
                                aVar.f120165z0 = i14;
                                aVar.f120164y0 = lVar.f17802o0;
                                int[] iArr = lVar.f17792j0;
                                if (iArr != null) {
                                    barrier.s(iArr);
                                } else {
                                    String str = lVar.f17794k0;
                                    if (str != null) {
                                        int[] r13 = r(barrier, str);
                                        lVar.f17792j0 = r13;
                                        barrier.s(r13);
                                    }
                                }
                            }
                            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                            layoutParams.a();
                            kVar.d(layoutParams);
                            c.f(childAt, kVar.f17769g);
                            childAt.setLayoutParams(layoutParams);
                            n nVar = kVar.f17765c;
                            if (nVar.f17831c == 0) {
                                childAt.setVisibility(nVar.f17830b);
                            }
                            childAt.setAlpha(nVar.f17832d);
                            o oVar = kVar.f17768f;
                            childAt.setRotation(oVar.f17836b);
                            childAt.setRotationX(oVar.f17837c);
                            childAt.setRotationY(oVar.f17838d);
                            childAt.setScaleX(oVar.f17839e);
                            childAt.setScaleY(oVar.f17840f);
                            if (oVar.f17843i != -1) {
                                if (((View) childAt.getParent()).findViewById(oVar.f17843i) != null) {
                                    float bottom = (r7.getBottom() + r7.getTop()) / 2.0f;
                                    float right = (r7.getRight() + r7.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(oVar.f17841g)) {
                                    childAt.setPivotX(oVar.f17841g);
                                }
                                if (!Float.isNaN(oVar.f17842h)) {
                                    childAt.setPivotY(oVar.f17842h);
                                }
                            }
                            childAt.setTranslationX(oVar.f17844j);
                            childAt.setTranslationY(oVar.f17845k);
                            childAt.setTranslationZ(oVar.f17846l);
                            if (oVar.f17847m) {
                                childAt.setElevation(oVar.f17848n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id3);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            k kVar2 = (k) hashMap.get(num);
            if (kVar2 != null) {
                l lVar2 = kVar2.f17767e;
                if (lVar2.f17790i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = lVar2.f17792j0;
                    if (iArr2 != null) {
                        barrier2.s(iArr2);
                    } else {
                        String str2 = lVar2.f17794k0;
                        if (str2 != null) {
                            int[] r14 = r(barrier2, str2);
                            lVar2.f17792j0 = r14;
                            barrier2.s(r14);
                        }
                    }
                    barrier2.f17643i = lVar2.f17786g0;
                    barrier2.f17645k.f120165z0 = lVar2.f17788h0;
                    ConstraintLayout.LayoutParams generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.x();
                    kVar2.d(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (lVar2.f17773a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.LayoutParams generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    kVar2.d(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = constraintLayout.getChildAt(i15);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).h(constraintLayout);
            }
        }
    }

    public final void e(int i13, int i14, int i15) {
        HashMap hashMap = this.f17857f;
        if (i14 == 1 || i14 == 2) {
            m(i13, 1, 0, i14, 0);
            m(i13, 2, 0, i15, 0);
            k kVar = (k) hashMap.get(Integer.valueOf(i13));
            if (kVar != null) {
                kVar.f17767e.f17812x = 0.5f;
                return;
            }
            return;
        }
        if (i14 == 6 || i14 == 7) {
            m(i13, 6, 0, i14, 0);
            m(i13, 7, 0, i15, 0);
            k kVar2 = (k) hashMap.get(Integer.valueOf(i13));
            if (kVar2 != null) {
                kVar2.f17767e.f17812x = 0.5f;
                return;
            }
            return;
        }
        m(i13, 3, 0, i14, 0);
        m(i13, 4, 0, i15, 0);
        k kVar3 = (k) hashMap.get(Integer.valueOf(i13));
        if (kVar3 != null) {
            kVar3.f17767e.f17813y = 0.5f;
        }
    }

    public final void f(int i13) {
        e(i13, 3, 4);
    }

    public final void g(int i13) {
        this.f17857f.remove(Integer.valueOf(i13));
    }

    public final void h(int i13, int i14) {
        k kVar;
        HashMap hashMap = this.f17857f;
        if (!hashMap.containsKey(Integer.valueOf(i13)) || (kVar = (k) hashMap.get(Integer.valueOf(i13))) == null) {
            return;
        }
        l lVar = kVar.f17767e;
        switch (i14) {
            case 1:
                lVar.f17791j = -1;
                lVar.f17789i = -1;
                lVar.G = -1;
                lVar.N = Integer.MIN_VALUE;
                return;
            case 2:
                lVar.f17795l = -1;
                lVar.f17793k = -1;
                lVar.H = -1;
                lVar.P = Integer.MIN_VALUE;
                return;
            case 3:
                lVar.f17799n = -1;
                lVar.f17797m = -1;
                lVar.I = 0;
                lVar.O = Integer.MIN_VALUE;
                return;
            case 4:
                lVar.f17801o = -1;
                lVar.f17803p = -1;
                lVar.f17772J = 0;
                lVar.Q = Integer.MIN_VALUE;
                return;
            case 5:
                lVar.f17805q = -1;
                lVar.f17806r = -1;
                lVar.f17807s = -1;
                lVar.M = 0;
                lVar.T = Integer.MIN_VALUE;
                return;
            case 6:
                lVar.f17808t = -1;
                lVar.f17809u = -1;
                lVar.L = 0;
                lVar.S = Integer.MIN_VALUE;
                return;
            case 7:
                lVar.f17810v = -1;
                lVar.f17811w = -1;
                lVar.K = 0;
                lVar.R = Integer.MIN_VALUE;
                return;
            case 8:
                lVar.C = -1.0f;
                lVar.B = -1;
                lVar.A = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public final void i(Context context, int i13) {
        j((ConstraintLayout) LayoutInflater.from(context).inflate(i13, (ViewGroup) null));
    }

    public final void j(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = this.f17857f;
        hashMap.clear();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = constraintLayout.getChildAt(i13);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id3 = childAt.getId();
            if (this.f17856e && id3 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id3))) {
                hashMap.put(Integer.valueOf(id3), new k());
            }
            k kVar = (k) hashMap.get(Integer.valueOf(id3));
            if (kVar != null) {
                kVar.f17769g = c.a(childAt, this.f17855d);
                kVar.f(id3, layoutParams);
                int visibility = childAt.getVisibility();
                n nVar = kVar.f17765c;
                nVar.f17830b = visibility;
                nVar.f17832d = childAt.getAlpha();
                float rotation = childAt.getRotation();
                o oVar = kVar.f17768f;
                oVar.f17836b = rotation;
                oVar.f17837c = childAt.getRotationX();
                oVar.f17838d = childAt.getRotationY();
                oVar.f17839e = childAt.getScaleX();
                oVar.f17840f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    oVar.f17841g = pivotX;
                    oVar.f17842h = pivotY;
                }
                oVar.f17844j = childAt.getTranslationX();
                oVar.f17845k = childAt.getTranslationY();
                oVar.f17846l = childAt.getTranslationZ();
                if (oVar.f17847m) {
                    oVar.f17848n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    boolean y13 = barrier.y();
                    l lVar = kVar.f17767e;
                    lVar.f17802o0 = y13;
                    lVar.f17792j0 = barrier.k();
                    lVar.f17786g0 = barrier.A();
                    lVar.f17788h0 = barrier.z();
                }
            }
        }
    }

    public final void k(p pVar) {
        HashMap hashMap = this.f17857f;
        hashMap.clear();
        for (Integer num : pVar.f17857f.keySet()) {
            k kVar = (k) pVar.f17857f.get(num);
            if (kVar != null) {
                hashMap.put(num, kVar.clone());
            }
        }
    }

    public final void l(int i13, int i14, int i15, int i16) {
        HashMap hashMap = this.f17857f;
        if (!hashMap.containsKey(Integer.valueOf(i13))) {
            hashMap.put(Integer.valueOf(i13), new k());
        }
        k kVar = (k) hashMap.get(Integer.valueOf(i13));
        if (kVar == null) {
            return;
        }
        l lVar = kVar.f17767e;
        switch (i14) {
            case 1:
                if (i16 == 1) {
                    lVar.f17789i = i15;
                    lVar.f17791j = -1;
                    return;
                } else if (i16 == 2) {
                    lVar.f17791j = i15;
                    lVar.f17789i = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + L(i16) + " undefined");
                }
            case 2:
                if (i16 == 1) {
                    lVar.f17793k = i15;
                    lVar.f17795l = -1;
                    return;
                } else if (i16 == 2) {
                    lVar.f17795l = i15;
                    lVar.f17793k = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + L(i16) + " undefined");
                }
            case 3:
                if (i16 == 3) {
                    lVar.f17797m = i15;
                    lVar.f17799n = -1;
                    lVar.f17805q = -1;
                    lVar.f17806r = -1;
                    lVar.f17807s = -1;
                    return;
                }
                if (i16 != 4) {
                    throw new IllegalArgumentException("right to " + L(i16) + " undefined");
                }
                lVar.f17799n = i15;
                lVar.f17797m = -1;
                lVar.f17805q = -1;
                lVar.f17806r = -1;
                lVar.f17807s = -1;
                return;
            case 4:
                if (i16 == 4) {
                    lVar.f17803p = i15;
                    lVar.f17801o = -1;
                    lVar.f17805q = -1;
                    lVar.f17806r = -1;
                    lVar.f17807s = -1;
                    return;
                }
                if (i16 != 3) {
                    throw new IllegalArgumentException("right to " + L(i16) + " undefined");
                }
                lVar.f17801o = i15;
                lVar.f17803p = -1;
                lVar.f17805q = -1;
                lVar.f17806r = -1;
                lVar.f17807s = -1;
                return;
            case 5:
                if (i16 == 5) {
                    lVar.f17805q = i15;
                    lVar.f17803p = -1;
                    lVar.f17801o = -1;
                    lVar.f17797m = -1;
                    lVar.f17799n = -1;
                    return;
                }
                if (i16 == 3) {
                    lVar.f17806r = i15;
                    lVar.f17803p = -1;
                    lVar.f17801o = -1;
                    lVar.f17797m = -1;
                    lVar.f17799n = -1;
                    return;
                }
                if (i16 != 4) {
                    throw new IllegalArgumentException("right to " + L(i16) + " undefined");
                }
                lVar.f17807s = i15;
                lVar.f17803p = -1;
                lVar.f17801o = -1;
                lVar.f17797m = -1;
                lVar.f17799n = -1;
                return;
            case 6:
                if (i16 == 6) {
                    lVar.f17809u = i15;
                    lVar.f17808t = -1;
                    return;
                } else if (i16 == 7) {
                    lVar.f17808t = i15;
                    lVar.f17809u = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + L(i16) + " undefined");
                }
            case 7:
                if (i16 == 7) {
                    lVar.f17811w = i15;
                    lVar.f17810v = -1;
                    return;
                } else if (i16 == 6) {
                    lVar.f17810v = i15;
                    lVar.f17811w = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + L(i16) + " undefined");
                }
            default:
                throw new IllegalArgumentException(L(i14) + " to " + L(i16) + " unknown");
        }
    }

    public final void m(int i13, int i14, int i15, int i16, int i17) {
        HashMap hashMap = this.f17857f;
        if (!hashMap.containsKey(Integer.valueOf(i13))) {
            hashMap.put(Integer.valueOf(i13), new k());
        }
        k kVar = (k) hashMap.get(Integer.valueOf(i13));
        if (kVar == null) {
            return;
        }
        l lVar = kVar.f17767e;
        switch (i14) {
            case 1:
                if (i16 == 1) {
                    lVar.f17789i = i15;
                    lVar.f17791j = -1;
                } else {
                    if (i16 != 2) {
                        throw new IllegalArgumentException("Left to " + L(i16) + " undefined");
                    }
                    lVar.f17791j = i15;
                    lVar.f17789i = -1;
                }
                lVar.G = i17;
                return;
            case 2:
                if (i16 == 1) {
                    lVar.f17793k = i15;
                    lVar.f17795l = -1;
                } else {
                    if (i16 != 2) {
                        throw new IllegalArgumentException("right to " + L(i16) + " undefined");
                    }
                    lVar.f17795l = i15;
                    lVar.f17793k = -1;
                }
                lVar.H = i17;
                return;
            case 3:
                if (i16 == 3) {
                    lVar.f17797m = i15;
                    lVar.f17799n = -1;
                    lVar.f17805q = -1;
                    lVar.f17806r = -1;
                    lVar.f17807s = -1;
                } else {
                    if (i16 != 4) {
                        throw new IllegalArgumentException("right to " + L(i16) + " undefined");
                    }
                    lVar.f17799n = i15;
                    lVar.f17797m = -1;
                    lVar.f17805q = -1;
                    lVar.f17806r = -1;
                    lVar.f17807s = -1;
                }
                lVar.I = i17;
                return;
            case 4:
                if (i16 == 4) {
                    lVar.f17803p = i15;
                    lVar.f17801o = -1;
                    lVar.f17805q = -1;
                    lVar.f17806r = -1;
                    lVar.f17807s = -1;
                } else {
                    if (i16 != 3) {
                        throw new IllegalArgumentException("right to " + L(i16) + " undefined");
                    }
                    lVar.f17801o = i15;
                    lVar.f17803p = -1;
                    lVar.f17805q = -1;
                    lVar.f17806r = -1;
                    lVar.f17807s = -1;
                }
                lVar.f17772J = i17;
                return;
            case 5:
                if (i16 == 5) {
                    lVar.f17805q = i15;
                    lVar.f17803p = -1;
                    lVar.f17801o = -1;
                    lVar.f17797m = -1;
                    lVar.f17799n = -1;
                    return;
                }
                if (i16 == 3) {
                    lVar.f17806r = i15;
                    lVar.f17803p = -1;
                    lVar.f17801o = -1;
                    lVar.f17797m = -1;
                    lVar.f17799n = -1;
                    return;
                }
                if (i16 != 4) {
                    throw new IllegalArgumentException("right to " + L(i16) + " undefined");
                }
                lVar.f17807s = i15;
                lVar.f17803p = -1;
                lVar.f17801o = -1;
                lVar.f17797m = -1;
                lVar.f17799n = -1;
                return;
            case 6:
                if (i16 == 6) {
                    lVar.f17809u = i15;
                    lVar.f17808t = -1;
                } else {
                    if (i16 != 7) {
                        throw new IllegalArgumentException("right to " + L(i16) + " undefined");
                    }
                    lVar.f17808t = i15;
                    lVar.f17809u = -1;
                }
                lVar.L = i17;
                return;
            case 7:
                if (i16 == 7) {
                    lVar.f17811w = i15;
                    lVar.f17810v = -1;
                } else {
                    if (i16 != 6) {
                        throw new IllegalArgumentException("right to " + L(i16) + " undefined");
                    }
                    lVar.f17810v = i15;
                    lVar.f17811w = -1;
                }
                lVar.K = i17;
                return;
            default:
                throw new IllegalArgumentException(L(i14) + " to " + L(i16) + " unknown");
        }
    }

    public final void n(int i13, int i14) {
        w(i13).f17767e.f17779d = i14;
    }

    public final void o(int i13, int i14) {
        w(i13).f17767e.f17777c = i14;
    }

    public final void p(int i13) {
        w(i13).f17767e.f17800n0 = true;
    }

    public final void q(int i13) {
        w(i13).f17767e.f17798m0 = true;
    }

    public final void s(int i13, int i14) {
        l lVar = w(i13).f17767e;
        lVar.f17773a = true;
        lVar.F = i14;
    }

    public final void t(int i13, int i14, int... iArr) {
        l lVar = w(i13).f17767e;
        lVar.f17790i0 = 1;
        lVar.f17786g0 = i14;
        lVar.f17788h0 = 0;
        lVar.f17773a = false;
        lVar.f17792j0 = iArr;
    }

    public final void u(int[] iArr, float[] fArr) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        w(iArr[0]).f17767e.V = fArr[0];
        w(iArr[0]).f17767e.W = 0;
        m(iArr[0], 6, 0, 6, -1);
        for (int i13 = 1; i13 < iArr.length; i13++) {
            int i14 = i13 - 1;
            m(iArr[i13], 6, iArr[i14], 7, -1);
            m(iArr[i14], 7, iArr[i13], 6, -1);
            w(iArr[i13]).f17767e.V = fArr[i13];
        }
        m(iArr[iArr.length - 1], 7, 0, 7, -1);
    }

    public final k w(int i13) {
        HashMap hashMap = this.f17857f;
        if (!hashMap.containsKey(Integer.valueOf(i13))) {
            hashMap.put(Integer.valueOf(i13), new k());
        }
        return (k) hashMap.get(Integer.valueOf(i13));
    }

    public final k x(int i13) {
        HashMap hashMap = this.f17857f;
        if (hashMap.containsKey(Integer.valueOf(i13))) {
            return (k) hashMap.get(Integer.valueOf(i13));
        }
        return null;
    }

    public final void y(Context context, int i13) {
        XmlResourceParser xml = context.getResources().getXml(i13);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    k v13 = v(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        v13.f17767e.f17773a = true;
                    }
                    this.f17857f.put(Integer.valueOf(v13.f17763a), v13);
                }
            }
        } catch (IOException e13) {
            e13.printStackTrace();
        } catch (XmlPullParserException e14) {
            e14.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01cf, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(android.content.Context r10, android.content.res.XmlResourceParser r11) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.p.z(android.content.Context, android.content.res.XmlResourceParser):void");
    }
}
