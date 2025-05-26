package com.modiface.mfemakeupkit.effects;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class MFEMakeupMascaraLayer extends MFEMakeupLayer implements Cloneable, MFEMakeupMascaraBaseLayer {
    public PointF[] referenceEyePoints;
    public final Style style;

    public enum Style {
        Wicked("wicked"),
        FringeGlamLashAndSmallWing("fringe_glam_lash_and_small_wing"),
        DefaultFalseLash("default"),
        WispyFlutterLashAndSmallWing("wispy_flutter_lash_and_small_wing"),
        ExtensionClusterLashAndSmallWing("extension_cluster_lash_and_small_wing"),
        EgoFlareLashAndSmallWing("ego_flare_lash_and_small_wing"),
        Custom("default"),
        Natural("natural"),
        NaturalLength("naturallength"),
        NaturalVolume("naturalVolume"),
        NaturalVolumeLength("naturalVolumeLength"),
        NaturalVolumeLower("naturalvolume_lower"),
        NaturalWhispy("naturalWhispy"),
        Lower("lower"),
        Length("length"),
        Volume("volume"),
        VolumeLength("volumeLength"),
        Doll("doll"),
        Natural2("natural_2"),
        Natural2Full("natural_2_full"),
        Volume2("volume_2"),
        Volume2Full("volume_2_full"),
        Doll2("doll_2"),
        Doll2Full("doll_2_full"),
        Extreme("extreme"),
        ExtremeFull("extreme_full"),
        FAAsia24("FA_Asia_2_4"),
        FAAsia25("FA_Asia_2_5"),
        IdoleLash("idole_lash"),
        PrimaBallerinaTopMascara("prima_ballerina_top_mascara"),
        NaturalLength2("naturallength_2"),
        Subtle("subtle"),
        SubtleFull("subtle_full"),
        Dense("dense"),
        DenseFull("densefull"),
        Grandiose("grandiose"),
        GrandioseFull("grandiose_full"),
        Drama("drama"),
        WickedLash("wicked_lash"),
        DramaFull("drama_full"),
        Overlay("overlay");

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

    public MFEMakeupMascaraLayer() {
        this.style = Style.Custom;
    }

    public MFEMakeupMascaraLayer(MFEMakeupProduct mFEMakeupProduct, Style style) {
        super(mFEMakeupProduct);
        this.style = style == null ? Style.Custom : style;
    }

    @Override // com.modiface.mfemakeupkit.effects.MFEMakeupLayer
    @NonNull
    /* renamed from: clone */
    public MFEMakeupMascaraLayer mo112clone() {
        MFEMakeupMascaraLayer mFEMakeupMascaraLayer = new MFEMakeupMascaraLayer(new MFEMakeupProduct(), this.style);
        copyBasePropertiesToOther(mFEMakeupMascaraLayer);
        PointF[] pointFArr = this.referenceEyePoints;
        mFEMakeupMascaraLayer.referenceEyePoints = pointFArr == null ? null : (PointF[]) pointFArr.clone();
        return mFEMakeupMascaraLayer;
    }
}
