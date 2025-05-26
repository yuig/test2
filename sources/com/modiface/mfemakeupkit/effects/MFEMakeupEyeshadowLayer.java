package com.modiface.mfemakeupkit.effects;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class MFEMakeupEyeshadowLayer extends MFEMakeupLayer implements Cloneable, MFEMakeupEyeshadowBaseLayer {
    public float deformableFactor;
    public PointF[] referenceBrowPoints;
    public PointF[] referenceEyePoints;
    public PointF[] referenceFullBrowPoints;
    public final Style style;
    public boolean useReferenceFullBrow;

    public enum Style {
        Custom("default"),
        Asian1Color("Asian_1color"),
        Asian2ColorA1("Asian_2color_A1"),
        Asian2ColorA2("Asian_2color_A2"),
        Asian2ColorB1("Asian_2color_B1"),
        Asian2ColorB2("Asian_2color_B2"),
        Asian3ColorA1("Asian_3color_A1"),
        Asian3ColorA2("Asian_3color_A2"),
        Asian3ColorA3("Asian_3color_A3"),
        Asian3ColorB1("Asian_3color_B1"),
        Asian3ColorB2("Asian_3color_B2"),
        Asian3ColorB3("Asian_3color_B3"),
        Lid("lid"),
        LidOpaque(null),
        Crease("crease"),
        FullLid("full_lid"),
        BrowHighlight("brow_highlight"),
        Outer("outer"),
        Inner("inner"),
        LidSharp("sharp_lid"),
        CreaseSharp("sharp_crease"),
        BrowHighlightSharp(null),
        OuterSharp("sharpouter_corner"),
        InnerSharp("sharpinner_lid"),
        LowerLashSharp("lowerlash"),
        FullCatEye("fullcateye"),
        SmokyCatEye("smokycateye"),
        InnerHalf("innerhalf"),
        OuterHalf("outerhalf"),
        Rectangular("rectangular"),
        ElongatedLid("elongated_lid"),
        Halloween1("halloween1"),
        FullLid2("full_lid2"),
        CheetahLid("cheetah_lid"),
        FullSmokyLid("full_smoky_lid"),
        AngularFull("angular_full"),
        WingedCrease("winged_crease"),
        FullLid3("full_lid3"),
        Bluelook1B1("bluelook1_b1"),
        OpLook2CS1("OP_look2_CS1"),
        SharpinnerLid("sharpinnerLid"),
        SummerpunchPart4("summerpunch_part4"),
        OpLook6ME5("OP_look6_ME5"),
        Innerlid("innerlid"),
        Colourqueenlook1Part1("colourqueenlook1_part1"),
        Crease3("crease3"),
        Bluelook2A("bluelook2_a"),
        EyegowildLook6("eyegowild_look6"),
        OpLook8ME2("OP_look8_ME2"),
        SportykickPart3("sportykick_part3"),
        Browline("browline"),
        Contour("contour"),
        CentreLid("centre_lid"),
        OpLook7P1("OP_look7_P1"),
        Bluelook3B("bluelook3_b"),
        Bluelook3A("bluelook3_a"),
        SharpLid2("sharp_lid2"),
        DeepAqua("deep_aqua"),
        Innercorner("innercorner"),
        OpLook3P1("OP_look3_P1"),
        Gold("gold"),
        Colourqueenlook3Part1("colourqueenlook3_part1"),
        DeepBlueFade("deep_blue_fade"),
        EyegowildLook2Upper("eyegowild_look2_upper"),
        FashionLook2Part1("fashion_look2_part1"),
        LaTear("la_tear"),
        SharpLid("sharpLid"),
        FulllidWinged("fulllid_winged"),
        EyegowildLook6Liner("eyegowild_look6_liner"),
        OpLook8G1("OP_look8_G1"),
        AngularOverlay("angular_overlay"),
        DeepBlue2("deep_blue_2"),
        MnyFashionWeekLook1Shadow1("MNY_FashionWeek_look1_shadow1"),
        Black("black"),
        EyeshadowBlue("eyeshadow_blue"),
        Center("center"),
        Bluelook1B2("bluelook1_b2"),
        OpLook6M4("OP_look6_M4"),
        EnergeticorangePart1("energeticorange_part1"),
        FullSmokyWinged("full_smoky_winged"),
        FashionLook2Part2("fashion_look2_part2"),
        Orangelook5C("orangelook5_c"),
        OuterCornerFramed("outer_corner_framed"),
        Bluelook1B("bluelook1_b"),
        FashionLook3Part2("fashion_look3_part2"),
        ConfidentEyeshadow("Confident_eyeshadow"),
        SharplidFull("sharplid_full"),
        Tear("tear");

        private static final Map<String, Style> PLACEMENT_TO_STYLE_MAP;
        private final String placement;

        static {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            for (Style style : values()) {
                String str = style.placement;
                if (str != null) {
                    concurrentHashMap.put(str, style);
                }
            }
            PLACEMENT_TO_STYLE_MAP = Collections.unmodifiableMap(concurrentHashMap);
        }

        Style(String str) {
            this.placement = str;
        }

        public static Style get(String str) {
            Style style = PLACEMENT_TO_STYLE_MAP.get(str);
            return style != null ? style : Custom;
        }

        private static String[] getEnumNames() {
            Style[] values = values();
            String[] strArr = new String[values.length];
            for (int i13 = 0; i13 < values.length; i13++) {
                strArr[i13] = values[i13].name();
            }
            return strArr;
        }
    }

    public MFEMakeupEyeshadowLayer() {
        this.useReferenceFullBrow = false;
        this.style = Style.Custom;
        this.deformableFactor = 1.0f;
    }

    @Override // com.modiface.mfemakeupkit.effects.MFEMakeupLayer
    @NonNull
    /* renamed from: clone */
    public MFEMakeupEyeshadowLayer mo112clone() {
        MFEMakeupEyeshadowLayer mFEMakeupEyeshadowLayer = new MFEMakeupEyeshadowLayer(new MFEMakeupProduct(), this.style);
        copyBasePropertiesToOther(mFEMakeupEyeshadowLayer);
        PointF[] pointFArr = this.referenceEyePoints;
        mFEMakeupEyeshadowLayer.referenceEyePoints = pointFArr == null ? null : (PointF[]) pointFArr.clone();
        PointF[] pointFArr2 = this.referenceBrowPoints;
        mFEMakeupEyeshadowLayer.referenceBrowPoints = pointFArr2 == null ? null : (PointF[]) pointFArr2.clone();
        PointF[] pointFArr3 = this.referenceFullBrowPoints;
        mFEMakeupEyeshadowLayer.referenceFullBrowPoints = pointFArr3 != null ? (PointF[]) pointFArr3.clone() : null;
        mFEMakeupEyeshadowLayer.useReferenceFullBrow = this.useReferenceFullBrow;
        mFEMakeupEyeshadowLayer.deformableFactor = this.deformableFactor;
        return mFEMakeupEyeshadowLayer;
    }

    public MFEMakeupEyeshadowLayer(MFEMakeupProduct mFEMakeupProduct, Style style) {
        super(mFEMakeupProduct);
        this.useReferenceFullBrow = false;
        this.style = style == null ? Style.Custom : style;
        this.deformableFactor = 3.0f;
    }
}
