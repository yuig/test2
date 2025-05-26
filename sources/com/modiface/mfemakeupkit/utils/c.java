package com.modiface.mfemakeupkit.utils;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\t\n\u0002\u0010\u000e\n\u0003\bÆ\u0001\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002\"\u0014\u0010\t\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0002\"\u0014\u0010\u000b\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0002\"\u0014\u0010\r\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0002\"\u0014\u0010\u000f\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0002\"\u0014\u0010\u0011\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0002\"\u0014\u0010\u0013\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0002\"\u0014\u0010\u0015\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0002\"\u0014\u0010\u0017\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0002\"\u0014\u0010\u0019\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0002\"\u0014\u0010\u001b\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0002\"\u0014\u0010\u001d\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0002\"\u0014\u0010\u001f\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0002\"\u0014\u0010!\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0002\"\u0014\u0010#\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0002\"\u0014\u0010%\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0002\"\u0014\u0010'\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u0002\"\u0014\u0010)\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u0002\"\u0014\u0010+\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\u0002\"\u0014\u0010-\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\u0002\"\u0014\u0010/\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\u0002\"\u0014\u00101\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010\u0002\"\u0014\u00103\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010\u0002\"\u0014\u00105\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010\u0002\"\u0014\u00107\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u0010\u0002\"\u0014\u00109\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u0010\u0002\"\u0014\u0010;\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u0010\u0002\"\u0014\u0010=\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u0010\u0002\"\u0014\u0010?\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u0010\u0002\"\u0014\u0010A\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u0010\u0002\"\u0014\u0010C\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u0010\u0002\"\u0014\u0010E\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u0010\u0002\"\u0014\u0010G\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bF\u0010\u0002\"\u0014\u0010I\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bH\u0010\u0002\"\u0014\u0010K\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bJ\u0010\u0002\"\u0014\u0010M\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bL\u0010\u0002\"\u0014\u0010O\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bN\u0010\u0002\"\u0014\u0010Q\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bP\u0010\u0002\"\u0014\u0010S\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bR\u0010\u0002\"\u0014\u0010U\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bT\u0010\u0002\"\u0014\u0010W\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bV\u0010\u0002\"\u0014\u0010Y\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bX\u0010\u0002\"\u0014\u0010[\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bZ\u0010\u0002\"\u0014\u0010]\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\\\u0010\u0002\"\u0014\u0010_\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b^\u0010\u0002\"\u0014\u0010a\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b`\u0010\u0002\"\u0014\u0010c\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bb\u0010\u0002\"\u0014\u0010e\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bd\u0010\u0002\"\u0014\u0010g\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bf\u0010\u0002\"\u0014\u0010i\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bh\u0010\u0002\"\u0014\u0010k\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bj\u0010\u0002\"\u0014\u0010m\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bl\u0010\u0002\"\u0014\u0010o\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bn\u0010\u0002\"\u0014\u0010q\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bp\u0010\u0002\"\u0014\u0010s\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\br\u0010\u0002\"\u0014\u0010u\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bt\u0010\u0002\"\u0014\u0010w\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bv\u0010\u0002\"\u0014\u0010y\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bx\u0010\u0002\"\u0014\u0010{\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bz\u0010\u0002\"\u0014\u0010}\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b|\u0010\u0002\"\u0014\u0010\u007f\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b~\u0010\u0002\"\u0016\u0010\u0081\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u0002\"\u0016\u0010\u0083\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010\u0002\"\u0016\u0010\u0085\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010\u0002\"\u0016\u0010\u0087\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010\u0002\"\u0016\u0010\u0089\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010\u0002\"\u0016\u0010\u008b\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010\u0002\"\u0016\u0010\u008d\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010\u0002\"\u0016\u0010\u008f\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010\u0002\"\u0016\u0010\u0091\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010\u0002\"\u0016\u0010\u0093\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010\u0002\"\u0016\u0010\u0095\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010\u0002\"\u0016\u0010\u0097\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010\u0002\"\u0016\u0010\u0099\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010\u0002\"\u0016\u0010\u009b\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010\u0002\"\u0016\u0010\u009d\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010\u0002\"\u0016\u0010\u009f\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u009e\u0001\u0010\u0002\"\u0016\u0010¡\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\b \u0001\u0010\u0002\"\u0016\u0010£\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\b¢\u0001\u0010\u0002\"\u0016\u0010¥\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\b¤\u0001\u0010\u0002\"\u0016\u0010§\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\b¦\u0001\u0010\u0002\"\u0016\u0010©\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\b¨\u0001\u0010\u0002\"\u0016\u0010«\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\bª\u0001\u0010\u0002\"\u0016\u0010\u00ad\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\b¬\u0001\u0010\u0002\"\u0016\u0010¯\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\b®\u0001\u0010\u0002\"\u0016\u0010±\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\b°\u0001\u0010\u0002\"\u0016\u0010³\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\b²\u0001\u0010\u0002\"\u0016\u0010µ\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\b´\u0001\u0010\u0002\"\u0016\u0010·\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\b¶\u0001\u0010\u0002\"\u0016\u0010¹\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\b¸\u0001\u0010\u0002\"\u0016\u0010»\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\bº\u0001\u0010\u0002\"\u0016\u0010½\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\b¼\u0001\u0010\u0002\"\u0016\u0010¿\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\b¾\u0001\u0010\u0002\"\u0016\u0010Á\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\bÀ\u0001\u0010\u0002\"\u0016\u0010Ã\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\bÂ\u0001\u0010\u0002\"\u0016\u0010Å\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0007\n\u0005\bÄ\u0001\u0010\u0002¨\u0006Æ\u0001"}, d2 = {"", "a", "Ljava/lang/String;", "kCmsVersion", "b", "kProducts", "c", "kShadeArray", "d", "kCategory", "e", "kPlacement", "f", "kLipVolume", "g", "kIntensity", "h", "kUseIntenseDynamicColorParameters", "i", "kColorR", "j", "kColorG", "k", "kColorB", "l", "kColorA", "m", "kGloss", "n", "kGlossDetail", "o", "kMatteness", "p", "kEnvMappingIntensity", "q", "kEnvMappingR", "r", "kEnvMappingG", "s", "kEnvMappingB", "t", "kEnvMappingRotationY", "u", "kEnvMappingCurve", "v", "kEnvMappingBumpIntensity", "w", "kSparkleIntensity", "x", "kSparkleR", "y", "kSparkleG", "z", "kSparkleB", "A", "kSparkleDensity", "B", "kSparkleSize", "C", "kSparkleBaseReflectivity", "D", "kSparkleColorVariation", "E", "kSparkleSizeVariation", "F", "kSparkleGlowSize", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "kSparkleGlowR", "H", "kSparkleGlowG", "I", "kSparkleGlowB", "J", "kUseLegacyGlitter", "K", "kTwinkleIntensity", "L", "kTwinkleDensity", "M", "kTwinkleR", "N", "kTwinkleG", "O", "kTwinkleB", "P", "kTwinkleSize", "Q", "kTwinkleSizeVariation", "R", "kTwinkleColorVariation", "S", "kSkinClearing", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "kSkinGlow", "U", "kIsSkinGlowDynamicByRotation", "V", "kContrastBoost", "W", "kMetallicIntensity", "X", "kVinylIntensity", "Y", "kSpecularCoarseness", "Z", "kTextureBoost", "a0", "kLustre", "b0", "kBlushGlow", "c0", "kEnableDynamicColor", "d0", "kPresetStyle", "e0", "kColorAmount", "f0", "kOuterAlign", "g0", "kOuterVertAlign", "h0", "kInnerAlign", "i0", "kInnerVertAlign", "j0", "kLocalArchPull", "k0", "kGlobalArchPull", "l0", "kInnerThickness", "m0", "kMiddleThickness", "n0", "kOuterThickness", "o0", "kCleaningTop", "p0", "kCleaningBottom", "q0", "kCleaningInnerVertical", "r0", "kCleaningInnerRoundness", "s0", "kPowderIntensity", "t0", "kOverlay", "u0", "kOverlayAmount", "v0", "kV33LipPlumping", "w0", "kV33ColorR", "x0", "kV33ColorG", "y0", "kV33ColorB", "z0", "kV33ColorA", "A0", "kV33Gamma", "B0", "kV33SparkleA", "C0", "kV33SparkleR", "D0", "kV33SparkleG", "E0", "kV33SparkleB", "F0", "kV33MetallicRoughness", "G0", "kV33OuterAlign", "H0", "kV33OuterVertAlign", "I0", "kV33InnerAlign", "J0", "kV33InnerVertAlign", "K0", "kV33LocalArchPull", "L0", "kV33GlobalArchPull", "M0", "kV33InnerThickness", "N0", "kV33MiddleThickness", "O0", "kV33OuterThickness", "P0", "kV33CleaningTop", "Q0", "kV33CleaningBottom", "R0", "kV33CleaningInnerVertical", "S0", "kV33CleaningInnerRoundness", "T0", "kV33OverlayAmount", "mfemakeupkit_retailerRelease"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes7.dex */
public final class c {

    @NotNull
    private static final String A = "sparkleDensity";

    @NotNull
    private static final String A0 = "gamma";

    @NotNull
    private static final String B = "sparkleSize";

    @NotNull
    private static final String B0 = "sparkle_a";

    @NotNull
    private static final String C = "sparkleBaseReflectivity";

    @NotNull
    private static final String C0 = "sparkle_r";

    @NotNull
    private static final String D = "sparkleColorVariation";

    @NotNull
    private static final String D0 = "sparkle_g";

    @NotNull
    private static final String E = "sparkleSizeVariation";

    @NotNull
    private static final String E0 = "sparkle_b";

    @NotNull
    private static final String F = "sparkleGlowSize";

    @NotNull
    private static final String F0 = "metallicRoughness";

    @NotNull
    private static final String G = "sparkleGlowR";

    @NotNull
    private static final String G0 = "outer_alignment_hor";

    @NotNull
    private static final String H = "sparkleGlowG";

    @NotNull
    private static final String H0 = "outer_alignment_ver";

    @NotNull
    private static final String I = "sparkleGlowB";

    @NotNull
    private static final String I0 = "inner_alignment_hor";

    /* renamed from: J, reason: collision with root package name */
    @NotNull
    private static final String f34619J = "useLegacyGlitter";

    @NotNull
    private static final String J0 = "inner_alignment_ver";

    @NotNull
    private static final String K = "twinkleIntensity";

    @NotNull
    private static final String K0 = "arch_pull";

    @NotNull
    private static final String L = "twinkleDensity";

    @NotNull
    private static final String L0 = "j_pull";

    @NotNull
    private static final String M = "twinkleR";

    @NotNull
    private static final String M0 = "inner_thickness";

    @NotNull
    private static final String N = "twinkleG";

    @NotNull
    private static final String N0 = "middle_thickness";

    @NotNull
    private static final String O = "twinkleB";

    @NotNull
    private static final String O0 = "outer_thickness";

    @NotNull
    private static final String P = "twinkleSize";

    @NotNull
    private static final String P0 = "cleaning_top";

    @NotNull
    private static final String Q = "twinkleSizeVariation";

    @NotNull
    private static final String Q0 = "cleaning_bottom";

    @NotNull
    private static final String R = "twinkleColorVariation";

    @NotNull
    private static final String R0 = "cleaning_vertical";

    @NotNull
    private static final String S = "skinClearing";

    @NotNull
    private static final String S0 = "cleaning_inner_roundness";

    @NotNull
    private static final String T = "skinGlow";

    @NotNull
    private static final String T0 = "overlay_amount";

    @NotNull
    private static final String U = "isSkinGlowDynamicByRotation";

    @NotNull
    private static final String V = "contrastBoost";

    @NotNull
    private static final String W = "metallicIntensity";

    @NotNull
    private static final String X = "vinylIntensity";

    @NotNull
    private static final String Y = "specularCoarseness";

    @NotNull
    private static final String Z = "textureBoost";

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f34620a = "cmsVersion";

    /* renamed from: a0, reason: collision with root package name */
    @NotNull
    private static final String f34621a0 = "lustre";

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f34622b = "products";

    /* renamed from: b0, reason: collision with root package name */
    @NotNull
    private static final String f34623b0 = "blushGlow";

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f34624c = "shadeArray";

    /* renamed from: c0, reason: collision with root package name */
    @NotNull
    private static final String f34625c0 = "enableDynamicColor";

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f34626d = "category";

    /* renamed from: d0, reason: collision with root package name */
    @NotNull
    private static final String f34627d0 = "presetStyle";

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f34628e = "placement";

    /* renamed from: e0, reason: collision with root package name */
    @NotNull
    private static final String f34629e0 = "colorAmount";

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f34630f = "lipVolume";

    /* renamed from: f0, reason: collision with root package name */
    @NotNull
    private static final String f34631f0 = "outerAlign";

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f34632g = "intensity";

    /* renamed from: g0, reason: collision with root package name */
    @NotNull
    private static final String f34633g0 = "outerVertAlign";

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String f34634h = "useIntenseDynamicColorParameters";

    /* renamed from: h0, reason: collision with root package name */
    @NotNull
    private static final String f34635h0 = "innerAlign";

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final String f34636i = "colorR";

    /* renamed from: i0, reason: collision with root package name */
    @NotNull
    private static final String f34637i0 = "innerVertAlign";

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final String f34638j = "colorG";

    /* renamed from: j0, reason: collision with root package name */
    @NotNull
    private static final String f34639j0 = "localArchPull";

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private static final String f34640k = "colorB";

    /* renamed from: k0, reason: collision with root package name */
    @NotNull
    private static final String f34641k0 = "globalArchPull";

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private static final String f34642l = "colorA";

    /* renamed from: l0, reason: collision with root package name */
    @NotNull
    private static final String f34643l0 = "innerThickness";

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private static final String f34644m = "gloss";

    /* renamed from: m0, reason: collision with root package name */
    @NotNull
    private static final String f34645m0 = "middleThickness";

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private static final String f34646n = "glossDetail";

    /* renamed from: n0, reason: collision with root package name */
    @NotNull
    private static final String f34647n0 = "outerThickness";

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private static final String f34648o = "matteness";

    /* renamed from: o0, reason: collision with root package name */
    @NotNull
    private static final String f34649o0 = "cleaningTop";

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private static final String f34650p = "envMappingIntensity";

    /* renamed from: p0, reason: collision with root package name */
    @NotNull
    private static final String f34651p0 = "cleaningBottom";

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private static final String f34652q = "envMappingR";

    /* renamed from: q0, reason: collision with root package name */
    @NotNull
    private static final String f34653q0 = "cleaningInnerVertical";

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private static final String f34654r = "envMappingG";

    /* renamed from: r0, reason: collision with root package name */
    @NotNull
    private static final String f34655r0 = "cleaningInnerRoundness";

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private static final String f34656s = "envMappingB";

    /* renamed from: s0, reason: collision with root package name */
    @NotNull
    private static final String f34657s0 = "powderIntensity";

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private static final String f34658t = "envMappingRotationY";

    /* renamed from: t0, reason: collision with root package name */
    @NotNull
    private static final String f34659t0 = "overlay";

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private static final String f34660u = "envMappingCurve";

    /* renamed from: u0, reason: collision with root package name */
    @NotNull
    private static final String f34661u0 = "overlayAmount";

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private static final String f34662v = "envMappingBumpIntensity";

    /* renamed from: v0, reason: collision with root package name */
    @NotNull
    private static final String f34663v0 = "lipPlumping";

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private static final String f34664w = "sparkleIntensity";

    /* renamed from: w0, reason: collision with root package name */
    @NotNull
    private static final String f34665w0 = "color_r";

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private static final String f34666x = "sparkleR";

    /* renamed from: x0, reason: collision with root package name */
    @NotNull
    private static final String f34667x0 = "color_g";

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private static final String f34668y = "sparkleG";

    /* renamed from: y0, reason: collision with root package name */
    @NotNull
    private static final String f34669y0 = "color_b";

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private static final String f34670z = "sparkleB";

    /* renamed from: z0, reason: collision with root package name */
    @NotNull
    private static final String f34671z0 = "color_a";
}
