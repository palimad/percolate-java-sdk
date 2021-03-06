package com.percolate.sdk.api.request.assets;

import com.percolate.sdk.enums.AssetIncludeType;
import com.percolate.sdk.enums.AssetOrientationType;
import com.percolate.sdk.enums.AssetSizeType;
import com.percolate.sdk.enums.AssetType;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Parameters for assets request.
 */
@SuppressWarnings("unused")
public class AssetsListParams {
    private Map<String, Object> params = new HashMap<>();

    public AssetsListParams() {
    }

    public AssetsListParams ids(List<String> ids) {
        params.put("ids", StringUtils.join(ids, ","));
        return this;
    }

    public AssetsListParams scopeIds(List<String> scopeIds) {
        params.put("scope_ids", StringUtils.join(scopeIds, ","));
        return this;
    }

    public AssetsListParams include(List<AssetIncludeType> include) {
        params.put("include", StringUtils.join(include, ",").toLowerCase(Locale.getDefault()));
        return this;
    }

    public AssetsListParams types(List<AssetType> types) {
        params.put("types", StringUtils.join(types, ",").toLowerCase(Locale.getDefault()));
        return this;
    }

    public AssetsListParams contentTypes(List<String> contentTypes) {
        params.put("content_types", StringUtils.join(contentTypes, ","));
        return this;
    }

    public AssetsListParams creatorIds(List<String> creatorIds) {
        params.put("creator_ids", StringUtils.join(creatorIds, ","));
        return this;
    }

    public AssetsListParams orientation(List<AssetOrientationType> orientation) {
        params.put("orientation", StringUtils.join(orientation, ",").toLowerCase(Locale.getDefault()));
        return this;
    }

    public AssetsListParams size(List<AssetSizeType> size) {
        params.put("size", StringUtils.join(size, ",").toLowerCase(Locale.getDefault()));
        return this;
    }

    public AssetsListParams folderId(String folderId) {
        params.put("folder_id", folderId);
        return this;
    }

    public AssetsListParams createdThrough(List<String> createdThrough) {
        params.put("created_through", StringUtils.join(createdThrough, ","));
        return this;
    }

    public AssetsListParams recursive(boolean recursive) {
        params.put("recursive", recursive);
        return this;
    }

    public AssetsListParams page(Integer page) {
        params.put("page", page);
        return this;
    }

    public AssetsListParams offset(Integer offset) {
        params.put("offset", offset);
        return this;
    }

    public AssetsListParams limit(Integer limit) {
        params.put("limit", limit);
        return this;
    }

    public AssetsListParams orderBy(String orderBy) {
        params.put("order_by", orderBy);
        return this;
    }

    public AssetsListParams orderDirection(String orderDirection) {
        params.put("order_direction", orderDirection);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}
