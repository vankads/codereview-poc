package com.wsgc.ecommerce.wcm.foundation.commons.util;

import com.wsgc.ecommerce.wcm.foundation.constants.SiteConstantsAndRegularExpressions;

import java.util.regex.Matcher;

/**
 * The Class PathUtil.
 * 
 * @author matthewjcarlson
 */
public final class PathUtil {

    /**
     * Instantiates a new path util.
     */
    private PathUtil() {

    }

    /**
     * Gets the season less path.
     * 
     * @param path
     *            the path
     * @return the season less path
     */
    public static String getSeasonLessPath(String path) {
        return path.replaceAll(SiteConstantsAndRegularExpressions.SEASONAL_CATALOG_BASE_PATTERN.pattern(), "");

    }

    /**
     * Gets the brandless path.
     * 
     * @param path
     *            the path
     * @return the brandless path
     */
    public static String getBrandlessPath(String path) {
        return path.replaceAll(SiteConstantsAndRegularExpressions.BRAND_PATTERN.pattern(), "");

    }

    /**
     * Returns a season path, without catalog, shop or any other subfolders.
     * 
     * @param path
     *            Full page path in a season (e.g.: /content/we/seasons/winter09/seasonalcatalog/groups)
     * @return Returns the season path (e.g.: /content/we/seasons/winter09/
     */
    public static String getSeasonPath(String path) {
        Matcher matcher = SiteConstantsAndRegularExpressions.SEASONAL_CATALOG_BASE_PATTERN.matcher(path);
        if (matcher.find()) {
            return matcher.group();
        }else{
            return "";
        }
        return null;
    }
}
