package bd1;

import com.appsflyer.AdRevenueScheme;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    private final String value;
    public static final b FIRSTNAME_FIELD = new b("FIRSTNAME_FIELD", 0, "first_name");
    public static final b LASTNAME_FIELD = new b("LASTNAME_FIELD", 1, "last_name");
    public static final b BUSINESS_NAME_FIELD = new b("BUSINESS_NAME_FIELD", 2, "business_name");
    public static final b USERNAME_FIELD = new b("USERNAME_FIELD", 3, "username");
    public static final b PRONOUNS = new b("PRONOUNS", 4, "pronouns");
    public static final b ABOUT_FIELD = new b("ABOUT_FIELD", 5, "about");
    public static final b LOCATION_FIELD = new b("LOCATION_FIELD", 6, "location");
    public static final b WEBSITE_FIELD = new b("WEBSITE_FIELD", 7, "website_url");
    public static final b EMAIL_FIELD = new b("EMAIL_FIELD", 8, "email");
    public static final b COUNTRY_FIELD = new b("COUNTRY_FIELD", 9, AdRevenueScheme.COUNTRY);
    public static final b GENDER_FIELD = new b("GENDER_FIELD", 10, "gender");
    public static final b CUSTOM_GENDER_FIELD = new b("CUSTOM_GENDER_FIELD", 11, "custom_gender");
    public static final b AGE_FIELD = new b("AGE_FIELD", 12, "age");
    public static final b BIRTHDAY_FIELD = new b("BIRTHDAY_FIELD", 13, "birthday");
    public static final b LANGUAGE_FIELD = new b("LANGUAGE_FIELD", 14, "locale");
    public static final b ADDITIONAL_LOCALES = new b("ADDITIONAL_LOCALES", 15, "additional_locales");
    public static final b BUSINESS_TYPE_FIELD = new b("BUSINESS_TYPE_FIELD", 16, "account_type");
    public static final b CONTACT_NAME_FIELD = new b("CONTACT_NAME_FIELD", 17, "contact_name");
    public static final b GROUP_ID = new b("GROUP_ID", 18, "group_id");
    public static final b SELECTED_LEVEL = new b("SELECTED_LEVEL", 19, "selected_level");
    public static final b ENABLE_PROFILE_MESSAGE = new b("ENABLE_PROFILE_MESSAGE", 20, "enable_profile_message");
    public static final b MESSAGING_PERMISSIONS = new b("MESSAGING_PERMISSIONS", 21, "messaging_permissions");
    public static final b CONTACT_PHONE_FIELD = new b("CONTACT_PHONE_FIELD", 22, "partner_contact_phone");
    public static final b CONTACT_PHONE_COUNTRY_PHONE_CODE_FIELD = new b("CONTACT_PHONE_COUNTRY_PHONE_CODE_FIELD", 23, "partner_contact_phone_country_code");
    public static final b CONTACT_PHONE_COUNTRY_CODE_FIELD = new b("CONTACT_PHONE_COUNTRY_CODE_FIELD", 24, "partner_contact_phone_country");
    public static final b SHOPPING_REC_DISABLED = new b("SHOPPING_REC_DISABLED", 25, "shopping_rec_disabled");
    public static final b ALLOW_IDEA_PIN_DOWNLOADS = new b("ALLOW_IDEA_PIN_DOWNLOADS", 26, "allow_idea_pin_downloads");
    public static final b CONTACT_EMAIL_FIELD = new b("CONTACT_EMAIL_FIELD", 27, "partner_contact_email");
    public static final b IDEA_PIN_STELA_REC_DISABLED = new b("IDEA_PIN_STELA_REC_DISABLED", 28, "ip_stela_rec_disabled");
    public static final b COMMENTS_DISABLED = new b("COMMENTS_DISABLED", 29, "comments_disabled");
    public static final b IS_PARENTAL_CONTROL_PASSCODE_ENABLED = new b("IS_PARENTAL_CONTROL_PASSCODE_ENABLED", 30, "is_parental_control_passcode_enabled");
    public static final b ALLOW_MENTIONS = new b("ALLOW_MENTIONS", 31, "allow_mentions");
    public static final b IS_PARENTAL_CONTROL_PASSCODE_VERIFICATION_PENDING = new b("IS_PARENTAL_CONTROL_PASSCODE_VERIFICATION_PENDING", 32, "is_parental_control_passcode_verification_pending");

    private static final /* synthetic */ b[] $values() {
        return new b[]{FIRSTNAME_FIELD, LASTNAME_FIELD, BUSINESS_NAME_FIELD, USERNAME_FIELD, PRONOUNS, ABOUT_FIELD, LOCATION_FIELD, WEBSITE_FIELD, EMAIL_FIELD, COUNTRY_FIELD, GENDER_FIELD, CUSTOM_GENDER_FIELD, AGE_FIELD, BIRTHDAY_FIELD, LANGUAGE_FIELD, ADDITIONAL_LOCALES, BUSINESS_TYPE_FIELD, CONTACT_NAME_FIELD, GROUP_ID, SELECTED_LEVEL, ENABLE_PROFILE_MESSAGE, MESSAGING_PERMISSIONS, CONTACT_PHONE_FIELD, CONTACT_PHONE_COUNTRY_PHONE_CODE_FIELD, CONTACT_PHONE_COUNTRY_CODE_FIELD, SHOPPING_REC_DISABLED, ALLOW_IDEA_PIN_DOWNLOADS, CONTACT_EMAIL_FIELD, IDEA_PIN_STELA_REC_DISABLED, COMMENTS_DISABLED, IS_PARENTAL_CONTROL_PASSCODE_ENABLED, ALLOW_MENTIONS, IS_PARENTAL_CONTROL_PASSCODE_VERIFICATION_PENDING};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private b(String str, int i13, String str2) {
        this.value = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
