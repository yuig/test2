package com.modiface.mfemakeupkit.effects;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class MFEMakeupBlushLayer extends MFEMakeupLayer implements Cloneable, MFEMakeupBlushBaseLayer {
    public float offsetX;
    public float offsetY;
    public float scaleX;
    public float scaleY;
    public final Style style;

    public enum Style {
        Custom("custom"),
        Blush("blush"),
        CheekBone("cheekbone"),
        FullCheek("full_cheek"),
        AppleBlended("apple_blended"),
        UpperCheekIntense("upper_cheek_intense"),
        LowerCheek("lower_cheek"),
        DefaultIntense("default_intense"),
        BlushDefault("blush_default"),
        CheekBoneIntense("cheekbone_intense"),
        AppleBlendedIntense("apple_blended_intense"),
        Apple2("apple2"),
        AppleIntense("apple_intense"),
        Apple("apple"),
        LowerCheekIntense("lower_cheek_intense"),
        FullCheekIntense("full_cheek_intense"),
        Highlight("highlight"),
        Cheek1("cheek1"),
        Glow4Sorbet("glow4_sorbet"),
        Eyebrow2("eyebrow2"),
        Chin("chin"),
        Cheek4("cheek4"),
        Glow1Cherie("glow1_cherie"),
        Nose3("nose3"),
        Glow2Monamour("glow2_monamour"),
        Undereye("undereye"),
        Cheek6("cheek6"),
        Eyebrow("eyebrow"),
        HighlightDefault("highlight_default"),
        Cheek2("cheek2"),
        Nose1("nose1"),
        Cheek3("cheek3"),
        Glow3Lavieenglow("glow3_lavieenglow"),
        Contour("contour"),
        Default3("default3"),
        InnerEyebrow2("inner_eyebrow2"),
        ContourDefault("contour_default"),
        Default2("default2"),
        Default4("default4"),
        InnerEyebrow("inner_eyebrow");

        private static final Map<String, Style> BLUSH_PLACEMENT_TO_STYLE_MAP;
        private final String placement;

        static {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            for (Style style : values()) {
                String str = style.placement;
                if (str != null) {
                    concurrentHashMap.put(str, style);
                }
            }
            BLUSH_PLACEMENT_TO_STYLE_MAP = Collections.unmodifiableMap(concurrentHashMap);
        }

        Style(String str) {
            this.placement = str;
        }

        public static Style get(String str, String str2) {
            Style style;
            if (str.equals("default") || str.isEmpty()) {
                style = BLUSH_PLACEMENT_TO_STYLE_MAP.get(str2 + "_default");
            } else {
                style = BLUSH_PLACEMENT_TO_STYLE_MAP.get(str);
            }
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

    public MFEMakeupBlushLayer() {
        this.style = Style.Custom;
        this.offsetX = 0.0f;
        this.offsetY = 0.0f;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
    }

    @Override // com.modiface.mfemakeupkit.effects.MFEMakeupLayer
    @NonNull
    /* renamed from: clone */
    public MFEMakeupBlushLayer mo112clone() {
        MFEMakeupBlushLayer mFEMakeupBlushLayer = new MFEMakeupBlushLayer();
        copyBasePropertiesToOther(mFEMakeupBlushLayer);
        mFEMakeupBlushLayer.offsetX = this.offsetX;
        mFEMakeupBlushLayer.offsetY = this.offsetY;
        mFEMakeupBlushLayer.scaleX = this.scaleX;
        mFEMakeupBlushLayer.scaleY = this.scaleY;
        return mFEMakeupBlushLayer;
    }

    public MFEMakeupBlushLayer(MFEMakeupProduct mFEMakeupProduct, Style style) {
        super(mFEMakeupProduct);
        this.style = style == null ? Style.Custom : style;
        this.offsetX = 0.1f;
        this.offsetY = -0.1f;
        this.scaleX = 1.2f;
        this.scaleY = 1.45f;
    }
}
