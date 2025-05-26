package com.modiface.mfemakeupkit.effects;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class MFEMakeupEyeLinerLayer extends MFEMakeupLayer implements Cloneable, MFEMakeupEyeLinerBaseLayer {
    public PointF[] referenceEyePoints;
    public final Style style;

    public enum Style {
        Custom("default"),
        Natural("natural"),
        NaturalFull("naturalfull"),
        CatEye("cateye"),
        CatEyeFull("cateyefull"),
        Puppy("puppy"),
        PuppyFull("puppyfull"),
        Smoky("smoky"),
        SmokyFull("smokyfull"),
        Winged("winged"),
        WingedFull("wingedfull"),
        Natural2(null),
        Natural2Full(null),
        CatEye2(null),
        CatEye2Full(null),
        Smoky2(null),
        Smoky2Full(null),
        SmokyNatural(null),
        SmokyNaturalFull(null),
        SmokyWinged(null),
        SmokyWingedFull(null),
        WingedSimple(null),
        WingedSimpleFull(null),
        WingedThin(null),
        WingedThinFull(null),
        WingedSmall(null),
        WingedSmallFull(null),
        WingedExtraSmall(null),
        WingedExtraSmallFull(null),
        Subtle(null),
        SubtleFull(null),
        Kohl(null),
        KohlFull(null),
        NaturalTop("natural_top"),
        WingedTop("winged_top"),
        CateyeTop("cateye_top"),
        Cateye2Top("cateye2_top"),
        SmokeyfullBoth("smokeyfull_both"),
        NaturalBoth("natural_both"),
        SmokynautralBoth("smokynautral_both"),
        SmokeyfullTop("smokeyfull_top"),
        WingedBoth("winged_both"),
        KohlBoth("kohl_both"),
        PuppyEyeTop("puppyeye_top"),
        SmallwingedTop("smallwinged_top"),
        WingedsimpleTop("wingedsimple_top"),
        Winged2Top("winged2_top"),
        SmokyTop("smoky_top"),
        CateyeBoth("cateye_both"),
        SmokynautralTop("smokynautral_top"),
        SmokyBoth("smoky_both"),
        SubtleTop("subtle_top"),
        CreaseFlareTop("crease_flare_top"),
        WingedthinTop("wingedthin_top"),
        Cateye2Both("cateye2_both"),
        FringeGlam("fringe_glam"),
        OapHalloween2020Look2_top("OAP_Halloween2020_look2_top"),
        SmallwingedBoth("smallwinged_both"),
        TopTop("top_top"),
        ExtrasmallwingedBoth("extrasmallwinged_both"),
        Natural2Top("natural2_top"),
        WhispyFlutter("whispy_flutter"),
        WingedthickTop("wingedthick_top"),
        CreaseBoxBoth("crease_box_both"),
        OapHalloween2020Look2Both("OAP_Halloween2020_look2_both"),
        Halloween4Top("halloween4_top"),
        WaterlineBoth("waterline_both"),
        OapHalloween2020Look1Top("OAP_Halloween2020_look1_top"),
        ExtrasmallwingedTop("extrasmallwinged_top"),
        OapHalloween2020Look3Top("OAP_Halloween2020_look3_top"),
        Natural2Both("natural2_both"),
        Halloween1Top("halloween1_top"),
        DoubleWingedTop("double_winged_top"),
        SubtleBoth("subtle_both"),
        Smoky2Both("smoky2_both"),
        PuppyeyeBoth("puppyeye_both"),
        SwoopWingedLinerBoth("swoop_winged_liner_both"),
        WingedthinBoth("wingedthin_both"),
        CreaseBoxTop("crease_box_top"),
        WingedthickBoth("wingedthick_both"),
        OapHalloween2020Look1Both("OAP_Halloween2020_look1_both"),
        MnyHolidayLook2EyelinerOuterTop("MNY_Holiday_look2_eyeliner_outer_top"),
        OapHalloween2020Look4Top("OAP_Halloween2020_look4_top"),
        KajaBoth("kaja_both"),
        ElongatedLidShadowTop("elongated_lid_shadow_top"),
        WaterlineThickTop("waterline_thick_top"),
        KohlTop("kohl_top"),
        SwoopWingedLinerTop("swoop_winged_liner_top"),
        WaterlineThickBoth("waterline_thick_both"),
        SmudgedBottomTop("smudged_bottom_top"),
        CheetahMaskTop("cheetah_mask_top"),
        FebruaryLiner9Top("february_liner9_top"),
        BoldEyelinerTop("Bold_eyeliner_top"),
        Winged2Both("winged2_both"),
        OapHalloween2020Look3Both("OAP_Halloween2020_look3_both"),
        ConfidentEyelinerBoth("Confident_eyeliner_both"),
        LaInnerWingedTop("la_inner_winged_top"),
        WaterlineTop("waterline_top"),
        PrimaBallerinaLinerTop("prima_ballerina_liner_top"),
        FebruaryLiner9Both("february_liner9_both"),
        TearTop("tear_top"),
        CheetahWingedTop("cheetah_winged_top"),
        DoubleWingedBoth("double_winged_both"),
        ElongatedBottomBoth("elongated_bottom_both"),
        ElongatedLidShadowBoth("elongated_lid_shadow_both");

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

    public MFEMakeupEyeLinerLayer() {
        this.style = Style.Custom;
    }

    public MFEMakeupEyeLinerLayer(MFEMakeupProduct mFEMakeupProduct, Style style) {
        super(mFEMakeupProduct);
        this.style = style == null ? Style.Custom : style;
    }

    @Override // com.modiface.mfemakeupkit.effects.MFEMakeupLayer
    @NonNull
    /* renamed from: clone */
    public MFEMakeupEyeLinerLayer mo112clone() {
        MFEMakeupEyeLinerLayer mFEMakeupEyeLinerLayer = new MFEMakeupEyeLinerLayer(new MFEMakeupProduct(), this.style);
        copyBasePropertiesToOther(mFEMakeupEyeLinerLayer);
        PointF[] pointFArr = this.referenceEyePoints;
        mFEMakeupEyeLinerLayer.referenceEyePoints = pointFArr == null ? null : (PointF[]) pointFArr.clone();
        return mFEMakeupEyeLinerLayer;
    }
}
