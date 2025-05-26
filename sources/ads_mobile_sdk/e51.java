package ads_mobile_sdk;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes2.dex */
public enum e51 implements a.w {
    AES(0),
    AES_CBC_RANDOMIV_HMAC(32),
    AES_CBC_RANDOMIV_HMAC_WITHDATA(33),
    AES_CTR(17),
    AES_CTR_NO_AUTH(60),
    AES_CTR_NO_AUTH_BROKEN(57),
    AES_CTR_NONCE_HMAC(38),
    AES_CTR_THEN_HMAC(24),
    AES_ECB(22),
    AES_IGE(16),
    AES_TET(25),
    AES_WRAPPING(21),
    DES(1),
    DSA(6),
    ENCRYPTED_KEY(39),
    HMAC_MD5(4),
    HMAC_SHA1(3),
    PUBLIC_DSA(7),
    PUBLIC_RSA(9),
    RSA(8),
    RSA_CERT_SIGNING(49),
    RSA_CERT_VERIFYING(50),
    RSA_WRAPPING(20),
    TEA(5),
    TESTING(15),
    TRIPLE_DES(2),
    TWO_KEY_TRIPLE_DES_CBC_ZEROIV(63),
    TWO_KEY_TRIPLE_DES_ECB(73),
    THREE_KEY_TRIPLE_DES_ECB(74),
    PORTUNUS_AES(46),
    PORTUNUS_DSA(44),
    PORTUNUS_ECDSA(48),
    PORTUNUS_RSA(43),
    PORTUNUS_RSA_SIGNING(42),
    UNKNOWN(62),
    HMAC_SHA1_TRUNCATED(23),
    HMAC_SHA256_TRUNCATED(34),
    HMAC_SHA512_TRUNCATED(35),
    HMAC_SHA256_HALF_DIGEST(70),
    GMAC(86),
    HMAC_SHA1_ATTACHED(RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL),
    HMAC_SHA256_ATTACHED(RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER),
    HMAC_SHA256_HALF_SIZE_TAG_ATTACHED(RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE),
    HMAC_SHA512_ATTACHED(RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW),
    HMAC_SHA512_HALF_SIZE_TAG_ATTACHED(RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN),
    TINK_HMAC(87),
    AES_CTR_RANDOM16BYTEIV_HMAC(55),
    AES_CTR_RANDOM16BYTEIV_HMAC_WITHDATA(56),
    AES_128_GCM(58),
    AES_256_GCM(59),
    AES_128_EAX(83),
    AES_256_EAX(84),
    AES_256_GCM_SIV(85),
    TINK_XCHACHA20_POLY1305(88),
    TINK_AES_CTR_HMAC_AEAD(89),
    TINK_AES_GCM_AEAD(95),
    TINK_AES_SIV_CMAC(90),
    AES_CTR_RANDOMIV_HMAC(36),
    AES_CTR_RANDOMIV_HMAC_WITHDATA(37),
    AES_CTR_SIV_HMAC(40),
    AES_CTR_SIV_HMAC_WITHTWEAK(41),
    AES_EAX_RANDOMIV(47),
    ECDSA_SIGNING(28),
    ECDSA_VERIFYING(29),
    RSA_SIGNING(18),
    RSA_VERIFYING(19),
    P256_ECDSA_SIGNING(64),
    P256_ECDSA_VERIFYING(65),
    ED25519_SIGNING(71),
    ED25519_VERIFYING(72),
    P256_ECDSA_JWT_SIGNING(77),
    P256_ECDSA_JWT_VERIFYING(78),
    P384_ECDSA_SIGNING(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE),
    P384_ECDSA_VERIFYING(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID),
    P521_ECDSA_SIGNING(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE),
    P521_ECDSA_VERIFYING(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE),
    RSA_2048_SIGNING(79),
    RSA_2048_VERIFYING(80),
    RSA_2048_PSS_SIGNING(81),
    RSA_2048_PSS_VERIFYING(82),
    RSA_4096_PSS_SHA256_SIGNING(RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL),
    RSA_4096_PSS_SHA256_VERIFYING(RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL),
    RSA_4096_PSS_SHA512_SIGNING(99),
    RSA_4096_PSS_SHA512_VERIFYING(100),
    RSA_3072_PSS_SHA384_SIGNING(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE),
    RSA_3072_PSS_SHA384_VERIFYING(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE),
    RSA_2048_PKCS1_SHA256_ATTACHED_SIGNING(RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE),
    RSA_2048_PKCS1_SHA256_ATTACHED_VERIFYING(RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER),
    RSA_4096_PKCS1_SHA256_ATTACHED_SIGNING(RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL),
    RSA_4096_PKCS1_SHA256_ATTACHED_VERIFYING(RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL),
    TINK_ECDSA_SIGNING(91),
    TINK_ECDSA_VERIFYING(92),
    ECIES_PRIVATE(52),
    ECIES_PUBLIC(51),
    HYBRID_PUBLIC_RSA(27),
    HYBRID_RSA(26),
    HYBRID_P256_AES_256_GCM_PUBLIC(66),
    HYBRID_P256_AES_256_GCM_PRIVATE(67),
    HYBRID_X25519_AES_256_GCM_PUBLIC(68),
    HYBRID_X25519_AES_256_GCM_PRIVATE(69),
    HYBRID_P256_AES_128_GCM_PUBLIC(75),
    HYBRID_P256_AES_128_GCM_PRIVATE(76),
    TINK_ECIES_AEAD_HKDF_PUBLIC(93),
    TINK_ECIES_AEAD_HKDF_PRIVATE(94),
    AEP_ECDSA(54),
    AEP_RSA_SIGNING(53),
    NFAST_AES(10),
    NFAST_DSA(12),
    NFAST_HMAC_SHA1(11),
    NFAST_PUBLIC_RSA(14),
    NFAST_RSA(13),
    NFAST_TRIPLE_DES(45),
    HMAC_SHA1_PRF_CTR(30),
    HMAC_SHA256_PRF_CTR(31),
    HKDF_SHA512(61),
    TINK(96),
    VU13P_FPGA_RSA_SIGNING(97),
    VU13P_FPGA_RSA_VERIFYING(98),
    AVENGER_IOC_RSA_SIGNING(RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER),
    AVENGER_IOC_RSA_VERIFYING(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE);


    /* renamed from: a, reason: collision with root package name */
    public final int f4708a;

    e51(int i13) {
        this.f4708a = i13;
    }

    public static e51 a(int i13) {
        switch (i13) {
            case 0:
                return AES;
            case 1:
                return DES;
            case 2:
                return TRIPLE_DES;
            case 3:
                return HMAC_SHA1;
            case 4:
                return HMAC_MD5;
            case 5:
                return TEA;
            case 6:
                return DSA;
            case 7:
                return PUBLIC_DSA;
            case 8:
                return RSA;
            case 9:
                return PUBLIC_RSA;
            case 10:
                return NFAST_AES;
            case 11:
                return NFAST_HMAC_SHA1;
            case 12:
                return NFAST_DSA;
            case 13:
                return NFAST_RSA;
            case 14:
                return NFAST_PUBLIC_RSA;
            case 15:
                return TESTING;
            case 16:
                return AES_IGE;
            case 17:
                return AES_CTR;
            case 18:
                return RSA_SIGNING;
            case 19:
                return RSA_VERIFYING;
            case 20:
                return RSA_WRAPPING;
            case 21:
                return AES_WRAPPING;
            case 22:
                return AES_ECB;
            case 23:
                return HMAC_SHA1_TRUNCATED;
            case 24:
                return AES_CTR_THEN_HMAC;
            case 25:
                return AES_TET;
            case 26:
                return HYBRID_RSA;
            case 27:
                return HYBRID_PUBLIC_RSA;
            case 28:
                return ECDSA_SIGNING;
            case 29:
                return ECDSA_VERIFYING;
            case 30:
                return HMAC_SHA1_PRF_CTR;
            case 31:
                return HMAC_SHA256_PRF_CTR;
            case 32:
                return AES_CBC_RANDOMIV_HMAC;
            case 33:
                return AES_CBC_RANDOMIV_HMAC_WITHDATA;
            case 34:
                return HMAC_SHA256_TRUNCATED;
            case 35:
                return HMAC_SHA512_TRUNCATED;
            case 36:
                return AES_CTR_RANDOMIV_HMAC;
            case 37:
                return AES_CTR_RANDOMIV_HMAC_WITHDATA;
            case 38:
                return AES_CTR_NONCE_HMAC;
            case 39:
                return ENCRYPTED_KEY;
            case 40:
                return AES_CTR_SIV_HMAC;
            case 41:
                return AES_CTR_SIV_HMAC_WITHTWEAK;
            case 42:
                return PORTUNUS_RSA_SIGNING;
            case 43:
                return PORTUNUS_RSA;
            case 44:
                return PORTUNUS_DSA;
            case 45:
                return NFAST_TRIPLE_DES;
            case 46:
                return PORTUNUS_AES;
            case 47:
                return AES_EAX_RANDOMIV;
            case 48:
                return PORTUNUS_ECDSA;
            case 49:
                return RSA_CERT_SIGNING;
            case 50:
                return RSA_CERT_VERIFYING;
            case 51:
                return ECIES_PUBLIC;
            case 52:
                return ECIES_PRIVATE;
            case 53:
                return AEP_RSA_SIGNING;
            case 54:
                return AEP_ECDSA;
            case 55:
                return AES_CTR_RANDOM16BYTEIV_HMAC;
            case 56:
                return AES_CTR_RANDOM16BYTEIV_HMAC_WITHDATA;
            case 57:
                return AES_CTR_NO_AUTH_BROKEN;
            case 58:
                return AES_128_GCM;
            case 59:
                return AES_256_GCM;
            case 60:
                return AES_CTR_NO_AUTH;
            case 61:
                return HKDF_SHA512;
            case 62:
                return UNKNOWN;
            case 63:
                return TWO_KEY_TRIPLE_DES_CBC_ZEROIV;
            case 64:
                return P256_ECDSA_SIGNING;
            case 65:
                return P256_ECDSA_VERIFYING;
            case 66:
                return HYBRID_P256_AES_256_GCM_PUBLIC;
            case 67:
                return HYBRID_P256_AES_256_GCM_PRIVATE;
            case 68:
                return HYBRID_X25519_AES_256_GCM_PUBLIC;
            case 69:
                return HYBRID_X25519_AES_256_GCM_PRIVATE;
            case 70:
                return HMAC_SHA256_HALF_DIGEST;
            case 71:
                return ED25519_SIGNING;
            case 72:
                return ED25519_VERIFYING;
            case 73:
                return TWO_KEY_TRIPLE_DES_ECB;
            case 74:
                return THREE_KEY_TRIPLE_DES_ECB;
            case 75:
                return HYBRID_P256_AES_128_GCM_PUBLIC;
            case 76:
                return HYBRID_P256_AES_128_GCM_PRIVATE;
            case 77:
                return P256_ECDSA_JWT_SIGNING;
            case 78:
                return P256_ECDSA_JWT_VERIFYING;
            case 79:
                return RSA_2048_SIGNING;
            case 80:
                return RSA_2048_VERIFYING;
            case 81:
                return RSA_2048_PSS_SIGNING;
            case 82:
                return RSA_2048_PSS_VERIFYING;
            case 83:
                return AES_128_EAX;
            case 84:
                return AES_256_EAX;
            case 85:
                return AES_256_GCM_SIV;
            case 86:
                return GMAC;
            case 87:
                return TINK_HMAC;
            case 88:
                return TINK_XCHACHA20_POLY1305;
            case 89:
                return TINK_AES_CTR_HMAC_AEAD;
            case 90:
                return TINK_AES_SIV_CMAC;
            case 91:
                return TINK_ECDSA_SIGNING;
            case 92:
                return TINK_ECDSA_VERIFYING;
            case 93:
                return TINK_ECIES_AEAD_HKDF_PUBLIC;
            case 94:
                return TINK_ECIES_AEAD_HKDF_PRIVATE;
            case 95:
                return TINK_AES_GCM_AEAD;
            case 96:
                return TINK;
            case 97:
                return VU13P_FPGA_RSA_SIGNING;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_VIDEO_CREATOR_ANALYTICS_MODULE /* 98 */:
                return VU13P_FPGA_RSA_VERIFYING;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NOTE_AND_FAVORITE_MODULE /* 99 */:
                return RSA_4096_PSS_SHA512_SIGNING;
            case 100:
                return RSA_4096_PSS_SHA512_VERIFYING;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE /* 101 */:
                return RSA_3072_PSS_SHA384_SIGNING;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE /* 102 */:
                return RSA_3072_PSS_SHA384_VERIFYING;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE /* 103 */:
                return P521_ECDSA_SIGNING;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE /* 104 */:
                return P521_ECDSA_VERIFYING;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE /* 105 */:
                return P384_ECDSA_SIGNING;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID /* 106 */:
                return P384_ECDSA_VERIFYING;
            case RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER /* 107 */:
                return AVENGER_IOC_RSA_SIGNING;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE /* 108 */:
                return AVENGER_IOC_RSA_VERIFYING;
            case RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL /* 109 */:
                return RSA_4096_PSS_SHA256_SIGNING;
            case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL /* 110 */:
                return RSA_4096_PSS_SHA256_VERIFYING;
            case RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE /* 111 */:
                return RSA_2048_PKCS1_SHA256_ATTACHED_SIGNING;
            case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER /* 112 */:
                return RSA_2048_PKCS1_SHA256_ATTACHED_VERIFYING;
            case RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL /* 113 */:
                return HMAC_SHA1_ATTACHED;
            case RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER /* 114 */:
                return HMAC_SHA256_ATTACHED;
            case RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE /* 115 */:
                return HMAC_SHA256_HALF_SIZE_TAG_ATTACHED;
            case RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW /* 116 */:
                return HMAC_SHA512_ATTACHED;
            case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN /* 117 */:
                return HMAC_SHA512_HALF_SIZE_TAG_ATTACHED;
            case RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL /* 118 */:
                return RSA_4096_PKCS1_SHA256_ATTACHED_SIGNING;
            case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL /* 119 */:
                return RSA_4096_PKCS1_SHA256_ATTACHED_VERIFYING;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + e51.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f4708a + " name=" + name() + '>';
    }

    @Override // a.w
    public final int a() {
        return this.f4708a;
    }
}
