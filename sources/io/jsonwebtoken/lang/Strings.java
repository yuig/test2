package io.jsonwebtoken.lang;

import a.a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;
import n60.o;

/* loaded from: classes4.dex */
public final class Strings {
    private static final String CURRENT_PATH = ".";
    private static final char EXTENSION_SEPARATOR = '.';
    private static final String FOLDER_SEPARATOR = "/";
    private static final String TOP_PATH = "..";
    public static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final String WINDOWS_FOLDER_SEPARATOR = "\\";

    private Strings() {
    }

    public static String[] addStringToArray(String[] strArr, String str) {
        if (Objects.isEmpty(strArr)) {
            return new String[]{str};
        }
        String[] strArr2 = new String[strArr.length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[strArr.length] = str;
        return strArr2;
    }

    public static String applyRelativePath(String str, String str2) {
        int lastIndexOf = str.lastIndexOf(FOLDER_SEPARATOR);
        if (lastIndexOf == -1) {
            return str2;
        }
        String substring = str.substring(0, lastIndexOf);
        if (!str2.startsWith(FOLDER_SEPARATOR)) {
            substring = a.C(substring, FOLDER_SEPARATOR);
        }
        return a.C(substring, str2);
    }

    public static String arrayToCommaDelimitedString(Object[] objArr) {
        return arrayToDelimitedString(objArr, ",");
    }

    public static String arrayToDelimitedString(Object[] objArr, String str) {
        if (Objects.isEmpty(objArr)) {
            return "";
        }
        if (objArr.length == 1) {
            return Objects.nullSafeToString(objArr[0]);
        }
        StringBuilder sb3 = new StringBuilder();
        for (int i13 = 0; i13 < objArr.length; i13++) {
            if (i13 > 0) {
                sb3.append(str);
            }
            sb3.append(objArr[i13]);
        }
        return sb3.toString();
    }

    public static String capitalize(String str) {
        return changeFirstCharacterCase(str, true);
    }

    private static String changeFirstCharacterCase(String str, boolean z13) {
        if (str == null || str.length() == 0) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder(str.length());
        if (z13) {
            sb3.append(Character.toUpperCase(str.charAt(0)));
        } else {
            sb3.append(Character.toLowerCase(str.charAt(0)));
        }
        sb3.append(str.substring(1));
        return sb3.toString();
    }

    public static String clean(String str) {
        CharSequence clean = clean((CharSequence) str);
        if (clean != null) {
            return clean.toString();
        }
        return null;
    }

    public static String cleanPath(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        String replace = replace(str, WINDOWS_FOLDER_SEPARATOR, FOLDER_SEPARATOR);
        int indexOf = replace.indexOf(":");
        if (indexOf != -1) {
            int i13 = indexOf + 1;
            str2 = replace.substring(0, i13);
            replace = replace.substring(i13);
        } else {
            str2 = "";
        }
        if (replace.startsWith(FOLDER_SEPARATOR)) {
            str2 = a.C(str2, FOLDER_SEPARATOR);
            replace = replace.substring(1);
        }
        String[] delimitedListToStringArray = delimitedListToStringArray(replace, FOLDER_SEPARATOR);
        LinkedList linkedList = new LinkedList();
        int i14 = 0;
        for (int length = delimitedListToStringArray.length - 1; length >= 0; length--) {
            String str3 = delimitedListToStringArray[length];
            if (!CURRENT_PATH.equals(str3)) {
                if (TOP_PATH.equals(str3)) {
                    i14++;
                } else if (i14 > 0) {
                    i14--;
                } else {
                    linkedList.add(0, str3);
                }
            }
        }
        for (int i15 = 0; i15 < i14; i15++) {
            linkedList.add(0, TOP_PATH);
        }
        StringBuilder i16 = o.i(str2);
        i16.append(collectionToDelimitedString(linkedList, FOLDER_SEPARATOR));
        return i16.toString();
    }

    public static String collectionToCommaDelimitedString(Collection<?> collection) {
        return collectionToDelimitedString(collection, ",");
    }

    public static String collectionToDelimitedString(Collection<?> collection, String str, String str2, String str3) {
        if (Collections.isEmpty(collection)) {
            return "";
        }
        StringBuilder sb3 = new StringBuilder();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            sb3.append(str2);
            sb3.append(it.next());
            sb3.append(str3);
            if (it.hasNext()) {
                sb3.append(str);
            }
        }
        return sb3.toString();
    }

    public static Set<String> commaDelimitedListToSet(String str) {
        TreeSet treeSet = new TreeSet();
        for (String str2 : commaDelimitedListToStringArray(str)) {
            treeSet.add(str2);
        }
        return treeSet;
    }

    public static String[] commaDelimitedListToStringArray(String str) {
        return delimitedListToStringArray(str, ",");
    }

    public static String[] concatenateStringArrays(String[] strArr, String[] strArr2) {
        if (Objects.isEmpty(strArr)) {
            return strArr2;
        }
        if (Objects.isEmpty(strArr2)) {
            return strArr;
        }
        String[] strArr3 = new String[strArr.length + strArr2.length];
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }

    public static boolean containsWhitespace(CharSequence charSequence) {
        if (!hasLength(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i13 = 0; i13 < length; i13++) {
            if (Character.isWhitespace(charSequence.charAt(i13))) {
                return true;
            }
        }
        return false;
    }

    public static int countOccurrencesOf(String str, String str2) {
        int i13 = 0;
        if (str == null || str2 == null || str.length() == 0 || str2.length() == 0) {
            return 0;
        }
        int i14 = 0;
        while (true) {
            int indexOf = str.indexOf(str2, i13);
            if (indexOf == -1) {
                return i14;
            }
            i14++;
            i13 = indexOf + str2.length();
        }
    }

    public static String delete(String str, String str2) {
        return replace(str, str2, "");
    }

    public static String deleteAny(String str, String str2) {
        if (!hasLength(str) || !hasLength(str2)) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder();
        for (int i13 = 0; i13 < str.length(); i13++) {
            char charAt = str.charAt(i13);
            if (str2.indexOf(charAt) == -1) {
                sb3.append(charAt);
            }
        }
        return sb3.toString();
    }

    public static String[] delimitedListToStringArray(String str, String str2) {
        return delimitedListToStringArray(str, str2, null);
    }

    public static boolean endsWithIgnoreCase(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        if (str.endsWith(str2)) {
            return true;
        }
        if (str.length() < str2.length()) {
            return false;
        }
        return str.substring(str.length() - str2.length()).toLowerCase().equals(str2.toLowerCase());
    }

    public static String getFilename(String str) {
        if (str == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(FOLDER_SEPARATOR);
        return lastIndexOf != -1 ? str.substring(lastIndexOf + 1) : str;
    }

    public static String getFilenameExtension(String str) {
        int lastIndexOf;
        if (str == null || (lastIndexOf = str.lastIndexOf(46)) == -1 || str.lastIndexOf(FOLDER_SEPARATOR) > lastIndexOf) {
            return null;
        }
        return str.substring(lastIndexOf + 1);
    }

    public static boolean hasLength(CharSequence charSequence) {
        return charSequence != null && charSequence.length() > 0;
    }

    public static boolean hasText(CharSequence charSequence) {
        if (!hasLength(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i13 = 0; i13 < length; i13++) {
            if (!Character.isWhitespace(charSequence.charAt(i13))) {
                return true;
            }
        }
        return false;
    }

    public static String[] mergeStringArrays(String[] strArr, String[] strArr2) {
        if (Objects.isEmpty(strArr)) {
            return strArr2;
        }
        if (Objects.isEmpty(strArr2)) {
            return strArr;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(java.util.Arrays.asList(strArr));
        for (String str : strArr2) {
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        return toStringArray(arrayList);
    }

    public static Locale parseLocaleString(String str) {
        String[] strArr = tokenizeToStringArray(str, "_ ", false, false);
        String str2 = "";
        String str3 = strArr.length > 0 ? strArr[0] : "";
        String str4 = strArr.length > 1 ? strArr[1] : "";
        validateLocalePart(str3);
        validateLocalePart(str4);
        if (strArr.length >= 2) {
            str2 = trimLeadingWhitespace(str.substring(str4.length() + str.indexOf(str4)));
            if (str2.startsWith("_")) {
                str2 = trimLeadingCharacter(str2, '_');
            }
        }
        if (str3.length() > 0) {
            return new Locale(str3, str4, str2);
        }
        return null;
    }

    public static boolean pathEquals(String str, String str2) {
        return cleanPath(str).equals(cleanPath(str2));
    }

    public static String quote(String str) {
        if (str != null) {
            return a.k("'", str, "'");
        }
        return null;
    }

    public static Object quoteIfString(Object obj) {
        return obj instanceof String ? quote((String) obj) : obj;
    }

    public static String[] removeDuplicateStrings(String[] strArr) {
        if (Objects.isEmpty(strArr)) {
            return strArr;
        }
        TreeSet treeSet = new TreeSet();
        for (String str : strArr) {
            treeSet.add(str);
        }
        return toStringArray(treeSet);
    }

    public static String replace(String str, String str2, String str3) {
        if (!hasLength(str) || !hasLength(str2) || str3 == null) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder();
        int indexOf = str.indexOf(str2);
        int length = str2.length();
        int i13 = 0;
        while (indexOf >= 0) {
            sb3.append(str.substring(i13, indexOf));
            sb3.append(str3);
            i13 = indexOf + length;
            indexOf = str.indexOf(str2, i13);
        }
        sb3.append(str.substring(i13));
        return sb3.toString();
    }

    public static String[] sortStringArray(String[] strArr) {
        if (Objects.isEmpty(strArr)) {
            return new String[0];
        }
        java.util.Arrays.sort(strArr);
        return strArr;
    }

    public static String[] split(String str, String str2) {
        int indexOf;
        if (hasLength(str) && hasLength(str2) && (indexOf = str.indexOf(str2)) >= 0) {
            return new String[]{str.substring(0, indexOf), str.substring(str2.length() + indexOf)};
        }
        return null;
    }

    public static Properties splitArrayElementsIntoProperties(String[] strArr, String str) {
        return splitArrayElementsIntoProperties(strArr, str, null);
    }

    public static boolean startsWithIgnoreCase(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        if (str.startsWith(str2)) {
            return true;
        }
        if (str.length() < str2.length()) {
            return false;
        }
        return str.substring(0, str2.length()).toLowerCase().equals(str2.toLowerCase());
    }

    public static String stripFilenameExtension(String str) {
        if (str == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(46);
        return (lastIndexOf != -1 && str.lastIndexOf(FOLDER_SEPARATOR) <= lastIndexOf) ? str.substring(0, lastIndexOf) : str;
    }

    public static boolean substringMatch(CharSequence charSequence, int i13, CharSequence charSequence2) {
        for (int i14 = 0; i14 < charSequence2.length(); i14++) {
            int i15 = i13 + i14;
            if (i15 >= charSequence.length() || charSequence.charAt(i15) != charSequence2.charAt(i14)) {
                return false;
            }
        }
        return true;
    }

    public static String toLanguageTag(Locale locale) {
        String str;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(locale.getLanguage());
        if (hasText(locale.getCountry())) {
            str = "-" + locale.getCountry();
        } else {
            str = "";
        }
        sb3.append(str);
        return sb3.toString();
    }

    public static String[] toStringArray(Collection<String> collection) {
        if (collection == null) {
            return null;
        }
        return (String[]) collection.toArray(new String[collection.size()]);
    }

    public static String[] tokenizeToStringArray(String str, String str2) {
        return tokenizeToStringArray(str, str2, true, true);
    }

    public static String trimAllWhitespace(String str) {
        if (!hasLength(str)) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder(str);
        int i13 = 0;
        while (sb3.length() > i13) {
            if (Character.isWhitespace(sb3.charAt(i13))) {
                sb3.deleteCharAt(i13);
            } else {
                i13++;
            }
        }
        return sb3.toString();
    }

    public static String[] trimArrayElements(String[] strArr) {
        if (Objects.isEmpty(strArr)) {
            return new String[0];
        }
        String[] strArr2 = new String[strArr.length];
        for (int i13 = 0; i13 < strArr.length; i13++) {
            String str = strArr[i13];
            strArr2[i13] = str != null ? str.trim() : null;
        }
        return strArr2;
    }

    public static String trimLeadingCharacter(String str, char c13) {
        if (!hasLength(str)) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder(str);
        while (sb3.length() > 0 && sb3.charAt(0) == c13) {
            sb3.deleteCharAt(0);
        }
        return sb3.toString();
    }

    public static String trimLeadingWhitespace(String str) {
        if (!hasLength(str)) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder(str);
        while (sb3.length() > 0 && Character.isWhitespace(sb3.charAt(0))) {
            sb3.deleteCharAt(0);
        }
        return sb3.toString();
    }

    public static String trimTrailingCharacter(String str, char c13) {
        if (!hasLength(str)) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder(str);
        while (sb3.length() > 0 && sb3.charAt(sb3.length() - 1) == c13) {
            sb3.deleteCharAt(sb3.length() - 1);
        }
        return sb3.toString();
    }

    public static String trimTrailingWhitespace(String str) {
        if (!hasLength(str)) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder(str);
        while (sb3.length() > 0 && Character.isWhitespace(sb3.charAt(sb3.length() - 1))) {
            sb3.deleteCharAt(sb3.length() - 1);
        }
        return sb3.toString();
    }

    public static String trimWhitespace(String str) {
        return (String) trimWhitespace((CharSequence) str);
    }

    public static String uncapitalize(String str) {
        return changeFirstCharacterCase(str, false);
    }

    public static String unqualify(String str) {
        return unqualify(str, '.');
    }

    private static void validateLocalePart(String str) {
        for (int i13 = 0; i13 < str.length(); i13++) {
            char charAt = str.charAt(i13);
            if (charAt != '_' && charAt != ' ' && !Character.isLetterOrDigit(charAt)) {
                throw new IllegalArgumentException(a.k("Locale part \"", str, "\" contains invalid characters"));
            }
        }
    }

    public static String[] delimitedListToStringArray(String str, String str2, String str3) {
        int i13 = 0;
        if (str == null) {
            return new String[0];
        }
        if (str2 == null) {
            return new String[]{str};
        }
        ArrayList arrayList = new ArrayList();
        if ("".equals(str2)) {
            while (i13 < str.length()) {
                int i14 = i13 + 1;
                arrayList.add(deleteAny(str.substring(i13, i14), str3));
                i13 = i14;
            }
        } else {
            while (true) {
                int indexOf = str.indexOf(str2, i13);
                if (indexOf == -1) {
                    break;
                }
                arrayList.add(deleteAny(str.substring(i13, indexOf), str3));
                i13 = str2.length() + indexOf;
            }
            if (str.length() > 0 && i13 <= str.length()) {
                arrayList.add(deleteAny(str.substring(i13), str3));
            }
        }
        return toStringArray(arrayList);
    }

    public static boolean hasLength(String str) {
        return hasLength((CharSequence) str);
    }

    public static Properties splitArrayElementsIntoProperties(String[] strArr, String str, String str2) {
        if (Objects.isEmpty(strArr)) {
            return null;
        }
        Properties properties = new Properties();
        for (String str3 : strArr) {
            if (str2 != null) {
                str3 = deleteAny(str3, str2);
            }
            String[] split = split(str3, str);
            if (split != null) {
                properties.setProperty(split[0].trim(), split[1].trim());
            }
        }
        return properties;
    }

    public static String[] toStringArray(Enumeration<String> enumeration) {
        if (enumeration == null) {
            return null;
        }
        ArrayList list = java.util.Collections.list(enumeration);
        return (String[]) list.toArray(new String[list.size()]);
    }

    public static String[] tokenizeToStringArray(String str, String str2, boolean z13, boolean z14) {
        if (str == null) {
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, str2);
        ArrayList arrayList = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (z13) {
                nextToken = nextToken.trim();
            }
            if (!z14 || nextToken.length() > 0) {
                arrayList.add(nextToken);
            }
        }
        return toStringArray(arrayList);
    }

    private static CharSequence trimWhitespace(CharSequence charSequence) {
        if (!hasLength(charSequence)) {
            return charSequence;
        }
        int length = charSequence.length();
        int i13 = 0;
        while (i13 < length && Character.isWhitespace(charSequence.charAt(i13))) {
            i13++;
        }
        int i14 = length;
        while (i13 < length && Character.isWhitespace(charSequence.charAt(i14 - 1))) {
            i14--;
        }
        return (i13 > 0 || i14 < length) ? charSequence.subSequence(i13, i14) : charSequence;
    }

    public static String unqualify(String str, char c13) {
        return str.substring(str.lastIndexOf(c13) + 1);
    }

    public static CharSequence clean(CharSequence charSequence) {
        CharSequence trimWhitespace = trimWhitespace(charSequence);
        if (hasLength(trimWhitespace)) {
            return trimWhitespace;
        }
        return null;
    }

    public static boolean containsWhitespace(String str) {
        return containsWhitespace((CharSequence) str);
    }

    public static boolean hasText(String str) {
        return hasText((CharSequence) str);
    }

    public static String collectionToDelimitedString(Collection<?> collection, String str) {
        return collectionToDelimitedString(collection, str, "", "");
    }
}
